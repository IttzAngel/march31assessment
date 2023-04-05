package people;

public class Salaried extends Employee implements Worker{

    private double salary;

    public Salaried(String name, int salary) {
        super(name);
        this.salary = salary / 52;
    }

    @Override
    public void calculatePay() {
        System.out.println("Salaried Employee's pay is: " + salary);
    }



//    private int ID;
//
//    private static int uniqueID = 1;
//
//    private String name;
//
////    public Salaried (String name){
////        ID = ++uniqueID;
////        this.name = name;
////    }
//
//    public String printName(){
//        return name;
//    }
//    public int printBadge() {
//        return ID;
//    }
//
//    public int salaryEmployeePay(){
//        return 104000 / 52;
//    }



}
