public class Policy {

    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Constructor that creates a Policy object.
     *
     * @param policyNumber the policy number
     * @param providerName the provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status
     * @param height the policyholder's height
     * @param weight the policyholder's weight
     */
    public Policy(String policyNumber, String providerName,
                  String firstName, String lastName,
                  int age, String smokingStatus,
                  double height, double weight) {

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
     * Returns the policy number.
     *
     * @return the policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Returns the provider name.
     *
     * @return the provider name
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Returns the policyholder's first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the policyholder's last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the policyholder's age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the policyholder's smoking status.
     *
     * @return the smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Returns the policyholder's height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the policyholder's weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Calculates the policyholder's BMI.
     *
     * @return the BMI
     */
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates the policy price.
     *
     * @return the policy price
     */
    public double getPrice() {

        double price = 600.00;

        if (age > 50) {
            price += 75.00;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.00;
        }

        if (getBMI() > 35) {
            price += (getBMI() - 35) * 20;
        }

        return price;
    }
}