public class Policy
{
   private String policyNumber;
      private String providerName;
          private String firstName;
             private String lastName;
               private int age; 
                  private String smokingStatus;
                     private double height;
                        private double weight;
   
   // no arg constructor 
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = ""; 
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   // Constructor with arguments
   public Policy(String pNumber, String provider, String fName, String lName, int a, String smoking, double h, double w)
   
   {
      policyNumber = pNumber;
      providerName = provider;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = smoking; 
      height = h; 
      weight = w;
   }
   
   // Setters
      public void setPolicyNumber(String pNumber)
      {
         policyNumber = pNumber;
      }
      
      public void setProvideName(String provider)
      {
         providerName = provider;
      }
      
      public void setFirstName(String fName)
      {
         firstName = fName;
      }
      public void setLastName(String lName)
      {
         lastName = lName;
      }
      
      public void setAge(int a)
   {
      age = a;
   }

   public void setSmokingStatus(String smoking)
   {
      smokingStatus = smoking;
   }

   public void setHeight(double h)
   {
      height = h;
   }

   public void setWeight(double w)
   {
      weight = w;
   }

   // Getters
   public String getPolicyNumber()
   {
      return policyNumber;
   }

   public String getProviderName()
   {
      return providerName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getAge()
   {
      return age;
   }

   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   // Calculate BMI
   public double getBMI()
   {
      return (weight * 703) / (height * height);
   }

   // Calculate insurance policy price
   public double getPolicyPrice()
   {
      double price = 600.0;

      if(age > 50)
      {
         price += 75.0;
      }

      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         price += 100.0;
      }

      if(getBMI() > 35)
      {
         price += (getBMI() - 35) * 20;
      }

      return price;
   }
}
      
                  