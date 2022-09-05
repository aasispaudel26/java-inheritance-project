package project;

public class Developer {
   private String platform;
   private String intervievername;
   private String developername;
   private double workinghour;

   public Developer( String platform, String intervievername, double workinghour  ){
      this.platform = platform;
      this.intervievername = intervievername;
      this.developername = "";
      this.workinghour = workinghour;
      
         
      }

      public String getPlatform(){
         return platform;

      }
      public String getInterviewername(){
         return intervievername;
      }
      public String getDevelopername(){
         return developername;
      }
      public double getWorkinghour(){
         return workinghour;
      }
      
      public void setDevelopername( String developername){
         this.developername = developername;

      }

      public void display(){
         System.out.println("the platform is " + platform);
         System.out.println("the interviewer name is " + intervievername);
         if (developername != ""){
            System.out.println("the deleloper name is " + developername);
         }
         
         System.out.println("the working hour is " + workinghour);

      }




   }


     

