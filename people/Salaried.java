package people;

public class Salaried {

    public int ID;

    public static int uniqueID = 0;

    public String name;

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
        return 80000 / 52;
    }

}