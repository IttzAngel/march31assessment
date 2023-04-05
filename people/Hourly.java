package people;

public class Hourly extends Employee implements Worker{


    private double hourlyRate;

    private double hoursWorked;

    public Hourly(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        System.out.println("Hourly Employee's pay is " + hourlyRate * hoursWorked);
    }



}
