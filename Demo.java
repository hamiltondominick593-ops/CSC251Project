import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Policy> policies = new ArrayList<Policy>();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {

            File file = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {

                String policyNumber = inputFile.nextLine();
                String providerName = inputFile.nextLine();
                String firstName = inputFile.nextLine();
                String lastName = inputFile.nextLine();

                int age = Integer.parseInt(inputFile.nextLine());
                String smokingStatus = inputFile.nextLine();
                double height = Double.parseDouble(inputFile.nextLine());
                double weight = Double.parseDouble(inputFile.nextLine());

                if (inputFile.hasNextLine()) {
                    inputFile.nextLine();
                }

                Policy policy = new Policy(
                        policyNumber,
                        providerName,
                        firstName,
                        lastName,
                        age,
                        smokingStatus,
                        height,
                        weight);

                policies.add(policy);
            }

            inputFile.close();

        } catch (IOException e) {

            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        for (Policy p : policies) {

            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println("Policyholder's First Name: " + p.getFirstName());
            System.out.println("Policyholder's Last Name: " + p.getLastName());
            System.out.println("Policyholder's Age: " + p.getAge());
            System.out.println(
                    "Policyholder's Smoking Status (smoker/non-smoker): "
                    + p.getSmokingStatus());

            System.out.printf(
                    "Policyholder's Height: %.1f inches%n",
                    p.getHeight());

            System.out.printf(
                    "Policyholder's Weight: %.1f pounds%n",
                    p.getWeight());

            System.out.printf(
                    "Policyholder's BMI: %.2f%n",
                    p.getBMI());

            System.out.printf(
                    "Policy Price: $%.2f%n%n",
                    p.getPrice());

            if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println(
                "The number of policies with a smoker is: "
                + smokerCount);

        System.out.println(
                "The number of policies with a non-smoker is: "
                + nonSmokerCount);
    }
}