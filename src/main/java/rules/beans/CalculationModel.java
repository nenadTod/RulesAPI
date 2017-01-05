package rules.beans;

/**
 * Created by Vuletic on 2.1.2017.
 */
public class CalculationModel {

    private double insuredAmountPrice;
    private int duration;
    private int youngs;
    private int adults;
    private int olds;
    private double dailyPrice;
    private double regionCoefficient;
    private double sportCoefficient;
    private double youngCoefficient;
    private double adultCoefficient;
    private double oldCoefficient;
    private double totalPrice;

    public CalculationModel() {
        totalPrice = 0;
    }

    public double getInsuredAmountPrice() {
        return insuredAmountPrice;
    }

    public void setInsuredAmountPrice(double insuredAmountPrice) {
        this.insuredAmountPrice = insuredAmountPrice;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYoungs() {
        return youngs;
    }

    public void setYoungs(int youngs) {
        this.youngs = youngs;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getOlds() {
        return olds;
    }

    public void setOlds(int olds) {
        this.olds = olds;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public double getRegionCoefficient() {
        return regionCoefficient;
    }

    public void setRegionCoefficient(double regionCoefficient) {
        this.regionCoefficient = regionCoefficient;
    }

    public double getSportCoefficient() {
        return sportCoefficient;
    }

    public void setSportCoefficient(double sportCoefficient) {
        this.sportCoefficient = sportCoefficient;
    }

    public double getYoungCoefficient() {
        return youngCoefficient;
    }

    public void setYoungCoefficient(double youngCoefficient) {
        this.youngCoefficient = youngCoefficient;
    }

    public double getAdultCoefficient() {
        return adultCoefficient;
    }

    public void setAdultCoefficient(double adultCoefficient) {
        this.adultCoefficient = adultCoefficient;
    }

    public double getOldCoefficient() {
        return oldCoefficient;
    }

    public void setOldCoefficient(double oldCoefficient) {
        this.oldCoefficient = oldCoefficient;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumberOfPeople(){
        return olds + youngs + adults;
    }

}
