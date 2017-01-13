package rules.model;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class InsuredPerson {

    private String name;
    private int ageGroup;
    private double basePrice;
    private double price;

    public InsuredPerson() {
    }

    public InsuredPerson(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public InsuredPerson(String name, int ageGroup) {
        this.name = name;
        this.ageGroup = ageGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
