import java.io.*;

/**
 * The Policy class represents an insurance policy for a individual policyholder.
 */
public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // in inches
    private double weight; // in pounds

    /**
     * No-arg constructor that initializes policy fields to default values.
     */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    /**
     * Parameterized constructor to initialize a Policy object with custom values.
     *
     * @param policyNumber  The policy identification number.
     * @param providerName  The name of the insurance provider.
     * @param firstName     The policyholder's first name.
     * @param lastName      The policyholder's last name.
     * @param age           The policyholder's age in years.
     * @param smokingStatus The smoking status ("smoker" or "non-smoker").
     * @param height        The policyholder's height in inches.
     * @param weight        The policyholder's weight in pounds.
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber The policy number to set.
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets the policy number.
     *
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the provider name.
     *
     * @param providerName The provider name to set.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Gets the provider name.
     *
     * @return The provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the policyholder's first name.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the policyholder's first name.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the policyholder's last name.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the policyholder's last name.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the policyholder's age.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the policyholder's age.
     *
     * @return The age in years.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the policyholder's smoking status.
     *
     * @param smokingStatus The smoking status ("smoker" or "non-smoker").
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Gets the policyholder's smoking status.
     *
     * @return The smoking status.
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the policyholder's height in inches.
     *
     * @param height The height in inches.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the policyholder's height in inches.
     *
     * @return The height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the policyholder's weight in pounds.
     *
     * @param weight The weight in pounds.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the policyholder's weight in pounds.
     *
     * @return The weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Calculates the Body Mass Index (BMI) of the policyholder.
     *
     * @return The calculated BMI value.
     */
    public double getBMI() {
        if (height == 0) {
            return 0.0;
        }
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates the total price of the insurance policy based on base fee,
     * age, smoking status, and BMI surcharge.
     *
     * @return The total price of the policy.
     */
    public double getPrice() {
        final double BASE_FEE = 600.0;
        double price = BASE_FEE;

        if (age > 50) {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = getBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
