package rules.model;

/**
 * Created by Vuletic on 13.1.2017.
 */
public class InsuredRealEstate {

    private double area;
   // private double estimatedPrice;
   // private double age;
    private boolean flood;
    private boolean fire;
    private boolean burglary;

    public InsuredRealEstate() {
    }

    public InsuredRealEstate(double area, boolean flood, boolean fire, boolean burglary) {
        this.area = area;
        this.flood = flood;
        this.fire = fire;
        this.burglary = burglary;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

   /* public double getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }*/

    public boolean isFlood() {
        return flood;
    }

    public void setFlood(boolean flood) {
        this.flood = flood;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public boolean isBurglary() {
        return burglary;
    }

    public void setBurglary(boolean burglary) {
        this.burglary = burglary;
    }
}
