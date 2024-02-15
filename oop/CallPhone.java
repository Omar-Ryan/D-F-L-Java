package oop;

public class CallPhone {
    private String manufacture;
    private String model;
    private double retailPrice;

    // Setter
    public void setManufacture(String man) {
        if (man == "Apple" || man == "Samsung" || man == "Nokia") {
            manufacture = man;
        } else {
            System.out.println("the Manufacture is Invalid");
        }
    }

    public void setModel(String mod) {
        model = mod;
    }

    public void setRetailPrice(double price) {
        if (price > 0) {
            retailPrice = price;
        } else {
            System.out.println("the price is Invalid");
        }
    }

    // Getter
    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
