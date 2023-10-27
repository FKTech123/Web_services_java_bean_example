import java.io.Serializable;

public class PersonBean implements Serializable {
    private String firstName;
    private String lastName;

    // Public no-argument constructor
    public PersonBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
