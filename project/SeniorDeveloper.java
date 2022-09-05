package project;

public class SeniorDeveloper extends Developer {
    private double salary;
    private String joiningDAte;
    private String staffRoomNumber;
    private double contactPeriod;
    private  double advanceSalary;
    private boolean appointed;
    private boolean terminated;

    public SeniorDeveloper( String platform, String intervievername,double workinghour,double salary,double contactPeriod){
       
       super(platform, intervievername, workinghour);
        this.salary = salary;
        this.joiningDAte = "";
        this.staffRoomNumber = "";
        this.contactPeriod = contactPeriod;
        this.advanceSalary = 0.0;
        this.appointed = false;
        this.terminated = false;
    
    }
    
    
    public double getSalary(){
        return salary;

     }
     public String getJoiningDate(){
        return joiningDAte;

     }
     public String getStaffRoomNumber(){
        return staffRoomNumber;

     }
     public double getContactPeriod(){
        return contactPeriod;

     }
     public double getAdvanceSalary(){
        return advanceSalary;

     }
     public boolean getAppointed(){
        return appointed;

     }
     public boolean getTerminated(){
        return terminated;

     }
     public void setSalary( double salary){
        this.salary = salary;

     }
     public void setContactPeriod( double contactPeriod){
        this.contactPeriod = contactPeriod;

     }
   public void hireDeveloper(String developername, String joiningDAte, String staffRoomNumber, double advanceSalary){
  
      if(appointed == true){
         System.out.println("The developer name is appointed & the staff room no. is "+ staffRoomNumber);
      }
      else{
         super.setDevelopername(developername);
         this.joiningDAte=joiningDAte;
         this.staffRoomNumber=staffRoomNumber;
         this.advanceSalary=advanceSalary;
         this.appointed=true;
         this.terminated=false;
      }
   }
   public void terminatedDeveloper(){
      if(terminated == true){
         System.out.println("The developer is already terminated");
      }
      else{
         super.setDevelopername("");
         this.joiningDAte="";
         this.advanceSalary=0.0;
         this.appointed=false;
         this.terminated=true;
      }
   }
   public void contractTerminate() {
      if (terminated == true) {
          System.out.println("Developer is terminated.");
      } else {
          super.setDevelopername("");
          joiningDAte = "";
          advanceSalary = 0.0;
          appointed = false;
          terminated = true;
      }
  }



  public void print() {
      System.out.println("Platform is " + super.getPlatform());
      System.out.println("Interviewer Name is " + super.getInterviewername());
      System.out.println("Salary is " + salary);
  }


  public void display() {
      super.display();

      
      if (appointed == true) {
          System.out.println("Termination status is " + terminated);
          System.out.println("Joining Date is " + joiningDAte);
          System.out.println("Advance Salary is " + advanceSalary);
          System.out.println("Developer name is " + super.getInterviewername());
      }
  }
}
