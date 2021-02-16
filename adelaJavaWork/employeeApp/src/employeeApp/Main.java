package employeeApp;
/*
employee factory/class
    Companies factory
    Health Plan class/factory
*/
public class Main
{
    private static void workWithData() //we need to work with a class directly or a method directly from that specific class we put static
    //static here means that a method can be called without instanciating an object
    {
        System.out.println("Welcome to Lambda School's Java");

        //create a healthplan object
        HealthPlan h1 = new HealthPlan("Adela's health plan");
        HealthPlan h2 = new HealthPlan("My healthplan 2");

        //create a company
        Company c1 = new Company("Adela company 1", 100);
        Company c2 = new Company("Company 2", 100);

        //employee
        Employee e1 = new Employee("Adela", "Zalewski", 90000, true, c1.id, h1.getId());
        Employee e2 = new Employee("Tyler", "Z", 45000, false, c2.id, h2.getId());
        Employee e3 = new Employee("Damiana", "Georgiana", 30000, false, c2.id, h1.getId());

        System.out.println(c1);

        e1.setSalary(e1.getSalary() + 5000);
        System.out.println(e1.getFname() + "" + e1.getSalary());
    }
    public static void main(String[] args)
    {
        workWithData();

    }
}