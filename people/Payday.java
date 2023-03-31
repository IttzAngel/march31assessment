package people;

public class Payday {

    public static void main(String[] args) {

        Hourly hourly = new Hourly("Mike");
        System.out.println("This hourly employees name is: " + hourly.printName());
        System.out.println("This hourly employees ID is: " + hourly.printBadge());
        System.out.println("This hourly employee was paid: $" + hourly.hourlyEmployeePay() + " this week");

        System.out.println("------------------------");

        Salaried salary = new Salaried("Jane");
        System.out.println("This salaried employees name is: " + salary.printName());
        System.out.println("This salaried employees ID is: " + salary.printBadge());
        System.out.println("This salaried employee was paid: $" + salary.salaryEmployeePay() + " this week");

        System.out.println("------------------------");

        Entrepreneurs entrepreneur = new Entrepreneurs("Jim");




    }
}
