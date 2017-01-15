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

    public InsuredCar() {
    }

    public InsuredCar(boolean towing, boolean repairment, boolean hotel, boolean alternativeRide) {
        this.towing = towing;
        this.repairment = repairment;
        this.hotel = hotel;
        this.alternativeRide = alternativeRide;
    }

    public InsuredCar(CalculatorData data){
        towing = data.getSelectedTowingDistance() != null ? true:false;
        repairment = data.getSelectedReparationPrice() != null ? true:false;
        hotel = data.getSelectedHotelDays() != null ? true:false;
        alternativeRide = data.getSelectedAlternateTransportationDistance() != null ? true:false;
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
}
