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

    private double realEstateAgeCoefficient;
    private double realEstateValuePrice;
    private double floodPricePerDay;
    private double firePricePerDay;
    private double burglaryPricePerDay;

    private double towPrice;
    private double repairPrice;
    private double hotelPrice;
    private double alternativePrice;

    private double VATRate;


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

    public double getRealEstateAgeCoefficient() {
        return realEstateAgeCoefficient;
    }

    public void setRealEstateAgeCoefficient(double realEstateAgeCoefficient) {
        this.realEstateAgeCoefficient = realEstateAgeCoefficient;
    }

    public double getRealEstateValuePrice() {
        return realEstateValuePrice;
    }

    public void setRealEstateValuePrice(double realEstateValuePrice) {
        this.realEstateValuePrice = realEstateValuePrice;
    }

    public double getFloodPricePerDay() {
        return floodPricePerDay;
    }

    public void setFloodPricePerDay(double floodPricePerDay) {
        this.floodPricePerDay = floodPricePerDay;
    }

    public double getFirePricePerDay() {
        return firePricePerDay;
    }

    public void setFirePricePerDay(double firePricePerDay) {
        this.firePricePerDay = firePricePerDay;
    }

    public double getBurglaryPricePerDay() {
        return burglaryPricePerDay;
    }

    public void setBurglaryPricePerDay(double burglaryPricePerDay) {
        this.burglaryPricePerDay = burglaryPricePerDay;
    }

    public double getTowPrice() {
        return towPrice;
    }

    public void setTowPrice(double towPrice) {
        this.towPrice = towPrice;
    }

    public double getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(double repairPrice) {
        this.repairPrice = repairPrice;
    }

    public double getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(double hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public double getAlternativePrice() {
        return alternativePrice;
    }

    public void setAlternativePrice(double alternativePrice) {
        this.alternativePrice = alternativePrice;
    }

    public double getVATRate() {
        return VATRate;
    }

    public void setVATRate(double VATRate) {
        this.VATRate = VATRate;
    }
}
