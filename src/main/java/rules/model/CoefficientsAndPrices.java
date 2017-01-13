package rules.model;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class CoefficientsAndPrices {

    private double sportCoefficient;
    private double regionCoefficient;
    private double insuredAmountPrice;
    private double pricePerDay;
    private double youngsCoefficient;
    private double adultsCoefficient;
    private double oldsCoefficient;

    private double carPricePerDay;
    /* TODO: ostalo */

    private double realEstatePricePerDay;
    /* TODO: ostalo */

    public CoefficientsAndPrices() {

    }

    public CoefficientsAndPrices(double sportCoefficient, double regionCoefficient, double insuredAmountPrice, double pricePerDay, double youngs, double adults, double olds) {
        this.sportCoefficient = sportCoefficient;
        this.regionCoefficient = regionCoefficient;
        this.insuredAmountPrice = insuredAmountPrice;
        this.pricePerDay = pricePerDay;
        this.youngsCoefficient = youngs;
        this.adultsCoefficient = adults;
        this.oldsCoefficient = olds;

    }

    public double getSportCoefficient() {
        return sportCoefficient;
    }

    public void setSportCoefficient(double sportCoefficient) {
        this.sportCoefficient = sportCoefficient;
    }

    public double getRegionCoefficient() {
        return regionCoefficient;
    }

    public void setRegionCoefficient(double regionCoefficient) {
        this.regionCoefficient = regionCoefficient;
    }

    public double getInsuredAmountPrice() {
        return insuredAmountPrice;
    }

    public void setInsuredAmountPrice(double insuredAmountPrice) {
        this.insuredAmountPrice = insuredAmountPrice;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getYoungsCoefficient() {
        return youngsCoefficient;
    }

    public void setYoungsCoefficient(double youngsCoefficient) {
        this.youngsCoefficient = youngsCoefficient;
    }

    public double getAdultsCoefficient() {
        return adultsCoefficient;
    }

    public void setAdultsCoefficient(double adultsCoefficient) {
        this.adultsCoefficient = adultsCoefficient;
    }

    public double getOldsCoefficient() {
        return oldsCoefficient;
    }

    public void setOldsCoefficient(double oldsCoefficient) {
        this.oldsCoefficient = oldsCoefficient;
    }

    public double getCarPricePerDay() {
        return carPricePerDay;
    }

    public void setCarPricePerDay(double carPricePerDay) {
        this.carPricePerDay = carPricePerDay;
    }

    public double getRealEstatePricePerDay() {
        return realEstatePricePerDay;
    }

    public void setRealEstatePricePerDay(double realEstatePricePerDay) {
        this.realEstatePricePerDay = realEstatePricePerDay;
    }
}
