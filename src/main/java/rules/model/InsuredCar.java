package rules.model;

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
