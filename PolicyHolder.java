public class PolicyHolder{

   private String firstName;
   private int age;
   private double weight;
   private double height;
   private String lastName;
   private boolean smoker;
      
      public PolicyHolder(){
      
      age = 0;
      weight = 0.0;
      height = 0.0;
      firstName = "";
      lastName = "";
      smoker = false;
      }
         public PolicyHolder(String firstName, String lastName, int age, double weight, double height, boolean smoker){
         
         
         
         
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.weight = weight;
          this.height = height;
          this.smoker = smoker;
          
      }
      public String getFirstName(){
      
      return firstName;
      }
      public String getLastName(){
      
      return lastName;
      }
      public int getAge(){
      
      return age;
      }
      public double getWeight(){
      
      return weight;
      }
      public double getHeight(){
      
      return height;
      }
      public boolean getSmoker(){
      
      return smoker;
      }   
         public void setFirstName(String firstName){
            this.firstName = firstName;
         }
         public void setLastName(String lastName){
            this.lastName = lastName;
         }
         public void setAge(int age){
            this.age = age;
         }
         public void setWeight(double weight){
            this.weight = weight;
         }
         public void setHeight(double height){
            this.height = height;
         }
         public void setSmoker(boolean smoker){
            this.smoker = smoker;
         }
            public double getBMI(){
               return (weight * 703) / (height  * height);
            }
                  public String toString(){
                  return "Policyholder's First Name: " + firstName + 
                         "\nPolicyholder's Last Name: " + lastName +
                         "\nPolicyholder's Age: " + age +
                         "\nPolicyholder's Smoker Status: " + smoker +
                         "\nPolicyholder's Height: " + height +
                         "\nPolicyholder's Weight: " + weight +
                         "\nPolicyholder's BMI: " + String.format("%.2f", getBMI());
                  
                  }
}