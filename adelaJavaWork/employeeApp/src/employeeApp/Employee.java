package employeeApp;

public class Employee {
    // fields (what does employee know about itself)
    //private = only the employee knows them if you want to know about them you use a getter
    //String a class = an array of the primitive type char 
    private static int maxId = 0; //this fild is what is called a class field so all employees will share this maxId
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401k;
    private int companyId;
    private int healthPlanId;

    //constructors = special type of  method; allows you ro set the initial state of the future object/we instanciate the object
    //always bublic
    //always the name of the class
    //always without a type
    public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId)
    {
        maxId++;
        id = maxId;
        //send the initial state
        //the fild variable so needs .this
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    //methods (behaviors); classes can do stuff

    //getters
    public int getId()
    {
        return id;
    }

    public String getFname() 
    {
        return fname;
    }

    public String getLname() 
    {
        return lname;
    }

    public double getSalary() 
    {
        return salary;
    }

    public boolean getHas401k() 
    {
        return has401k;
    }

    public int getcompanyId() 
    {
        return companyId;
    }

    public int getHealthPlanId() 
    {
        return healthPlanId;
    }

    //setters
    //if it doesnt return a value it has to send void
    public void setFname(String fname) 
    {
        this.fname = fname;
    }

    public void setLname(String lname) 
    {
        this.lname = lname;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public void setHas401k(boolean has401k) 
    {
        this.has401k = has401k;
    }

    public void setcompanyId(int companyId) 
    {
        this.companyId = companyId;
    }

    public void setHealthPlanId(int healthPlanId) 
    {
        this.healthPlanId = healthPlanId;
    }

    //other methods beside getters and setters
    public String getName()
    {
        return fname + " " + lname;
    }
    
}
