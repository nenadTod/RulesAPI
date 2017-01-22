package rules.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class RulesModel {

    private ArrayList<InsuredPerson> insuredPeople = new ArrayList<>();
    private InsuredCar insuredCar;
    private InsuredRealEstate insuredRealEstate;
    private int days;
    private double groupDiscount;
    private double packageDiscount;
    private double totalPrice;
    private Boolean sport;
    private double VAT;
    private double VATRate;

    private int selectedLocation;
    private int selectedSport;
    private int selectedInsuranceAmount;

    private Date dateFrom;
    private Date dateTo;

    private Boolean realEstateInsured;
    private Boolean carInsured;

    public RulesModel() {
        totalPrice = 0;
    }

    public ArrayList<InsuredPerson> getInsuredPeople() {
        return insuredPeople;
    }

    public void setInsuredPeople(ArrayList<InsuredPerson> insuredPeople) {
        this.insuredPeople = insuredPeople;
    }

    public InsuredCar getInsuredCar() {
        return insuredCar;
    }

    public void setInsuredCar(InsuredCar insuredCar) {
        this.insuredCar = insuredCar;
    }

    public InsuredRealEstate getInsuredRealEstate() {
        return insuredRealEstate;
    }

    public void setInsuredRealEstate(InsuredRealEstate insuredRealEstate) {
        this.insuredRealEstate = insuredRealEstate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getTotalPrice() {
        totalPrice = 0;
        for (InsuredPerson p: insuredPeople){
            totalPrice += p.getPrice();
        }
        if (insuredCar != null)
            totalPrice += insuredCar.getPrice();

        if(insuredRealEstate != null)
            totalPrice += insuredRealEstate.getPrice();

        return totalPrice;
    }

    public void addPerson(InsuredPerson p){
        insuredPeople.add(p);
    }

    public int getNumberOfPeople(){
        return insuredPeople.size();
    }

    public double getGroupDiscount() {
        return groupDiscount;
    }

    public void setGroupDiscount(double discount) {
        this.groupDiscount = discount;
    }

    public double getPackageDiscount() {
        return packageDiscount;
    }

    public void setPackageDiscount(double packageDiscount) {
        this.packageDiscount = packageDiscount;
    }

    public double getTotalDiscount() {
        return packageDiscount + groupDiscount;
    }

    public boolean getSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public boolean getCarInsured() {
        return carInsured;
    }

    public void setCarInsured(boolean carInsured) {
        this.carInsured = carInsured;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public boolean getRealEstateInsured() {
        return realEstateInsured;
    }

    public void setRealEstateInsured(boolean realEstateInsured) {
        this.realEstateInsured = realEstateInsured;
    }

    public int getSelectedInsuranceAmount() {
        return selectedInsuranceAmount;
    }

    public void setSelectedInsuranceAmount(int selectedInsuranceAmount) {
        this.selectedInsuranceAmount = selectedInsuranceAmount;
    }

    public int getSelectedSport() {
        return selectedSport;
    }

    public void setSelectedSport(int selectedSport) {
        this.selectedSport = selectedSport;
    }

    public int getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(int selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getVATRate() {
        return VATRate;
    }

    public void setVATRate(double VATRate) {
        this.VATRate = VATRate;
    }
}
