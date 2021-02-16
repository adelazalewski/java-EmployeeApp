package employeeApp;

public class Company {
    //filds
    public static int maxId = 0;
    public int id;
    public String name;
    public int debt;

    //constructor
    public Company(String name, int debt)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }
    @Override
    public String toString()
    {
        String rtStr = "Company name: " + name + "debt: " + debt;
        return rtStr;
    }
}
