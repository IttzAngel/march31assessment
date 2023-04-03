package people;

public class Hourly extends Employee{


    private int ID;

    private int hourlyRate = 15;

    private int hoursWorked = 40;

    private static int uniqueID = 0;

    public String name;

    public Hourly (String name){
        ID = ++uniqueID;
        this.name = name;
    }

    public String printName(){
        return name;
    }
    public int printBadge() {
        return ID;
    }

    public int hourlyEmployeePay(){
        return hourlyRate * hoursWorked;

    }
}
