package pojoUtility;

public class EmployeePOJO
{
    private String name;
    private int age;
    private double salary;
    private ColleguesPOJO collegues;

    public EmployeePOJO(String name, int age, double salary, ColleguesPOJO collegues)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.collegues = collegues;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public ColleguesPOJO getCollegues()
    {
        return collegues;
    }

    public void setCollegues(ColleguesPOJO collegues)
    {
        this.collegues = collegues;
    }
}
