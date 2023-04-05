package people;

public class Payday {

    public static void main(String[] args) {

        String[] workers = {"Mike", "Jane", "Jim"};

        Hourly hourly = new Hourly("Mike", 15, 40);
        //System.out.println("This hourly employees name is: " + hourly.printName());
        hourly.printName();
        hourly.calculatePay();
        hourly.printBadge();
//        System.out.println("This hourly employees ID is: " + hourly.printBadge());
        //System.out.println("This hourly employee was paid: $" + hourly.hourlyEmployeePay() + " this week");

        System.out.println("------------------------");

        Salaried salary = new Salaried("Jane", 104000);
        //System.out.println("This salaried employees name is: " + salary.printName());
        //System.out.println("This salaried employees ID is: " + salary.printBadge());
        salary.printName();
        salary.calculatePay();
        salary.printBadge();

        System.out.println("------------------------");

        //Entrepreneurs entrepreneur = new Entrepreneurs("Jim");




    }
}
