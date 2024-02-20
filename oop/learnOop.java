package oop;

public class learnOop {
    public static void main(String[] args) {

        CallPhone infoPhone = new CallPhone();
        Cars infoCars = new Cars();
        Rectangle infoRectangle = new Rectangle();
        Rectangle infoRectangle2 = new Rectangle(20, 30);
        Employee EmpData = new Employee();
        Employee EmpData2 = new Employee(10, "Omar", "Testing", 1000, 150, true);

        Employee EmpDataT = new Employee(30, "O.R", true);
        Employee EmpData3 = new Employee(EmpDataT, "CT3", 4400, 33);

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
        // Use Constructor
        System.out.println("The new Width and Length of Rectangle => infoRectangle2");
        System.out.println(infoRectangle2.getWidth());
        System.out.println(infoRectangle2.getLength());

        // Employee

        System.out.println("Default data of Employee Constructor");
        EmpData.printEmpData();
        System.out.println(" data of Employee overloading Constructor");
        EmpData2.printEmpData();

        EmpData.setEmpID(7);
        EmpData.setName("Ryan");
        EmpData.setDepart("Marketing");
        EmpData.setSalary(7000, 350);
        EmpData.setResident(true);

        System.out.println(" data of Employee Constructor after Setting");
        EmpData.printEmpData();

        System.out.println(" data of Employee Copy Constructor");
        EmpData3.printEmpData();

        // Static Class
        System.out.println(Calc.add(7, 15));
        System.out.println(Calc.Sub(25, 10));
        System.out.println(Calc.add(2.5, 20));

    }
}
