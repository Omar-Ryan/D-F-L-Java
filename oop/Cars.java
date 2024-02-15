package oop;

public class Cars {
    private String make;
    private int yearsModel;

    // Setter
    public void setMake(String ma) {
        if (ma == "Toyota" || ma == "Honda") {
            make = ma;
        } else {
            System.out.println("The Maker is Invalid");
        }
    }

    public void setYearsModel(int yM) {
        if (yM > 2005) {
            yearsModel = yM;
        } else {
            System.out.println("The Model is Invalid");
        }
    }

    // getter
    public String getMake() {
        return make;
    }

    public int getYearsModel() {
        return yearsModel;
    }
}
