package rules;

import java.util.ArrayList;

/**
 * Created by Vuletic on 14.12.2016.
 */
public class InsuredGroup {

    private ArrayList<InsuredPerson> insuredPeople = new ArrayList<>();
    private double totalPrice;

    public InsuredGroup() {
        totalPrice = 0;
    }

    public ArrayList<InsuredPerson> getInsuredPeople() {
        return insuredPeople;
    }

    public void setInsuredPeople(ArrayList<InsuredPerson> insuredPeople) {
        this.insuredPeople = insuredPeople;
    }

    public int getNumberOfPeople() {
        return insuredPeople.size();
    }

    public boolean addPerson(InsuredPerson p){
        try {
            insuredPeople.add(p);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public double calculateWithDiscount(double coef){
        totalPrice = 0;
        for (InsuredPerson p: insuredPeople) {
            totalPrice += p.getTotalPrice()*coef;
        }
        return totalPrice;
    }

    public double calculate(){
        totalPrice = 0;
        for (InsuredPerson p: insuredPeople) {
            totalPrice += p.getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
