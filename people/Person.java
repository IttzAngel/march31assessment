package people;

public abstract class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String printName(){
        return this.name;
    }

    String[] workers = {"Mike", "Jane", "Jim"};

    public static void printPay(Worker[] workers){
        for (Worker worker : workers){
            worker.calculatePay();
        }
    }

    public abstract void printBadge();


}
