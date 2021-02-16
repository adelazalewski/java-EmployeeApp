package employeeApp;

public class HealthPlan {
    //filds
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public HealthPlan(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    //getters
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
