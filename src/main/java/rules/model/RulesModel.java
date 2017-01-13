package rules.model;

import java.util.ArrayList;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class RulesModel {

    private ArrayList<InsuredPerson> insuredPeople = new ArrayList<>();
    private InsuredCar insuredCar;
    private InsuredRealEstate insuredRealEstate;
    private int days;
    private double discount;
    private double totalPrice;

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
        return totalPrice;
    }

    public void addPerson(InsuredPerson p){
        insuredPeople.add(p);
    }

    public int getNumberOfPeople(){
        return insuredPeople.size();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}