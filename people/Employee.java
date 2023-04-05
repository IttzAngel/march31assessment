package people;

public class Employee extends Person {

    private static int badgeNumber = 1;

    private int ID;




    public Employee(String name) {
        super(name);
        this.ID = badgeNumber++;
    }

    public int printID(){
        return this.ID;
    }



    @Override
    public void printBadge() {
        System.out.println("This employee's ID is: " + ID);

    }
}
