package rules.model;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class InsuredPerson {

    private int id;
    private int ageGroup;
    private double basePrice;
    private double price;

    public InsuredPerson() {
        basePrice = 0;
        price = 0;
    }

    public InsuredPerson(int ageGroup) {
        this.ageGroup = ageGroup;
        basePrice = 0;
        price = 0;
    }

    public InsuredPerson(int id, int ageGroup) {
        this.id = id;
        this.ageGroup = ageGroup;
        basePrice = 0;
        price = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
