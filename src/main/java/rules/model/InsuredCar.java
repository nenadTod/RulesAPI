package rules.model;

import rules.beans.CalculatorData;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class InsuredCar {

    private boolean towing;
    private boolean repairment;
    private boolean hotel;
    private boolean alternativeRide;
    private double price;

    private int selectedAlternateTransportationDistance;
    private int selectedHotelDays;
    private int selectedTowingDistance;
    private int selectedReparationPrice;

    public InsuredCar() {
        price = 0;
    }

    public InsuredCar(boolean towing, boolean repairment, boolean hotel, boolean alternativeRide) {
        this.towing = towing;
        this.repairment = repairment;
        this.hotel = hotel;
        this.alternativeRide = alternativeRide;
        price = 0;
    }

    public InsuredCar(CalculatorData data){
        towing = data.getTowing();
        repairment = data.getRepair();
        hotel = data.getHotel();
        alternativeRide = data.getAlternateTransport();
        price = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTowing() {
        return towing;
    }

    public void setTowing(boolean towing) {
        this.towing = towing;
    }

    public boolean isRepairment() {
        return repairment;
    }

    public void setRepairment(boolean repairment) {
        this.repairment = repairment;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public boolean isAlternativeRide() {
        return alternativeRide;
    }

    public void setAlternativeRide(boolean alternativeRide) {
        this.alternativeRide = alternativeRide;
    }

    public int getSelectedAlternateTransportationDistance() {
        return selectedAlternateTransportationDistance;
    }

    public void setSelectedAlternateTransportationDistance(int selectedAlternateTransportationDistance) {
        this.selectedAlternateTransportationDistance = selectedAlternateTransportationDistance;
    }

    public int getSelectedHotelDays() {
        return selectedHotelDays;
    }

    public void setSelectedHotelDays(int selectedHotelDays) {
        this.selectedHotelDays = selectedHotelDays;
    }

    public int getSelectedTowingDistance() {
        return selectedTowingDistance;
    }

    public void setSelectedTowingDistance(int selectedTowingDistance) {
        this.selectedTowingDistance = selectedTowingDistance;
    }

    public int getSelectedReparationPrice() {
        return selectedReparationPrice;
    }

    public void setSelectedReparationPrice(int selectedReparationPrice) {
        this.selectedReparationPrice = selectedReparationPrice;
    }
}
