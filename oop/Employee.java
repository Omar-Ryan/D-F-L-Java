package oop;

public class Employee {

    private int Emp_ID;
    private String Name;
    private String Depart;
    private double Salary;
    private double Bonus;
    private boolean Resident;

    // Constructor
    public Employee() {
        Emp_ID = 01;
        this.Name = "No Name";
        Depart = "No assigned";
        Salary = 1000.0;
        Bonus = 100.0;
        Resident = true;
    }

    public Employee(int ID, String Name) {
        Emp_ID = ID;
        this.Name = Name;
    }

    public Employee(int ID, String Name, boolean Resident) {
        Emp_ID = ID;
        this.Name = Name;
        this.Resident = Resident;
    }

    // Copy constructor or next

    public Employee(Employee obj1, String depart, double Salary, double Bonus) {
        Emp_ID = obj1.Emp_ID;
        Name = obj1.Name;
        Resident = obj1.Resident;
        // OR
        // this(obj1.Emp_ID, obj1.Name, obj1.Resident);

        Depart = depart;
        this.Salary = Salary;
        this.Bonus = Bonus;
    }

    public Employee(int ID, String Name, String depart, double Salary, double Bonus, boolean Resident) {
        Emp_ID = ID;
        this.Name = Name;
        Depart = depart;
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Resident = Resident;
    }

    // Setter

    public void setEmpID(int ID) {
        Emp_ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setSalary(double Salary, double bonus) {
        this.setSalary(Salary);
        this.Bonus = bonus;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }

    public void setResident(boolean Resident) {
        this.Resident = Resident;
    }

    // Getter
    public void printEmpData() {
        System.out.println("ID : " + Emp_ID);
        System.out.println("Name : " + Name);
        System.out.println("Depart : " + Depart);
        System.out.println("Salary : " + Salary);
        System.out.println("Bonus : " + Bonus);
        System.out.println("Resident : " + Resident);
    }

}
