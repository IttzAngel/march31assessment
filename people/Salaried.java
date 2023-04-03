package people;

public class Salaried extends Employee{

    private int ID;

    private static int uniqueID = 1;

    private String name;

    public Salaried (String name){
        ID = ++uniqueID;
        this.name = name;
    }

    public String printName(){
        return name;
    }
    public int printBadge() {
        return ID;
    }

    public int salaryEmployeePay(){
        return 104000 / 52;
    }

}
