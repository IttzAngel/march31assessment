package people;

public class Hourly {


    public int ID;

    public int hourlyRate = 15;

    public int hoursWorked = 40;

    public static int uniqueID = 0;

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
