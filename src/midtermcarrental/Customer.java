
package midtermcarrental;

/**
 * models a car rental customer.
 * Created for midterm exam.
 * @author dancye, 2023
 * modifier Taranpreet Singh
 * Student ID: 991716542
 */
public class Customer 
{
    private String lastName;
    private String firstName;
    private int birthYear;
    private boolean insurance;

    public static final String[] customerTypes = {"Main driver", "Occasional driver"};

    public Customer(String givenLast, String givenFirst, int givenBirthYear)
    {
        lastName = givenLast;
        firstName = givenFirst;
        birthYear = givenBirthYear;           
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean hasInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isEligibleToRent() {
        return (2023 - birthYear) >= 21;
    }
}
   