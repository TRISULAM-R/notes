package pojoUtility;

public class ColleguesPOJO
{
    private String firstName;
    private String lastName;

    public ColleguesPOJO()
    {
        // empty constructor for de-serialization
        // or InvalidDefinitionException
    }

    public ColleguesPOJO(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
