package CarDealership;

public class Vehicle {

    private String VIN, make, model, color;
    private double wholesaleCost, retailPrice;
    private int modelYear;

    // Our constructor with all properties
    public Vehicle(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color) {
        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.color = color;
        this.wholesaleCost = wholesaleCost;
        this.retailPrice = retailPrice;
        this.modelYear = modelYear;
    }

    // Getters
    public String getVin() {
        return VIN;
    }

    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setVin(String VIN) {
        this.VIN = VIN;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override // Annotation telling us and compiler that we are Overriding previously defined
              // behavior
    public String toString() {
        return this.getModelYear() + " " + this.getMake() + " " + this.getModel();
    }

    public double getTargetMargin() {
        return this.retailPrice - this.wholesaleCost;
    }
}