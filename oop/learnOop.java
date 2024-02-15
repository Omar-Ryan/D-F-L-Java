package oop;

public class learnOop {
    public static void main(String[] args) {

        CallPhone infoPhone = new CallPhone();
        Cars infoCars = new Cars();
        Rectangle infoRectangle = new Rectangle();

        // Call Phone
        infoPhone.setManufacture("Samsung");
        infoPhone.setModel("A10S");
        infoPhone.setRetailPrice(11500.0);

        System.out.println(infoPhone.getManufacture());
        System.out.println(infoPhone.getModel());
        System.out.println(infoPhone.getRetailPrice());

        // Cars
        infoCars.setMake("Toyota");
        infoCars.setYearsModel(2017);
        System.out.println(infoCars.getMake());
        System.out.println(infoCars.getYearsModel());

        // Rectangle

        System.out.println("The Default Width and Length of Rectangle");
        System.out.println(infoRectangle.getWidth());
        System.out.println(infoRectangle.getLength());

        infoRectangle.setWidth(20);
        infoRectangle.setLength(25);
        System.out.println("The new Width and Length of Rectangle");
        System.out.println(infoRectangle.getWidth());
        System.out.println(infoRectangle.getLength());
    }
}
