// Declaring abstract classes

public abstract class AbstractEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public AbstractEmployee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nSocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
