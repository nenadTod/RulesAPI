package rules;

/**
 * Created by Vuletic on 16.12.2016.
 */
public class InsuredPerson {

    private double insuredAmountPrice;
    private int duration;
    private double price;
    private double regionCoefficient;
    private double sportCoefficient;
    private double ageCoefficient;
    private double totalPrice;

    public InsuredPerson(){
        insuredAmountPrice = 1000;
        duration = 7;
        price = 150;
        regionCoefficient = 1.2;
        sportCoefficient = 1.1;
        ageCoefficient = 0.9;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public double getAgeCoefficient() {
        return ageCoefficient;
    }

    public void setAgeCoefficient(double ageCoefficient) {
        this.ageCoefficient = ageCoefficient;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
