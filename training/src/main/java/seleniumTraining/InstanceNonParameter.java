package seleniumTraining;

public class InstanceNonParameter {
	 public  void details() 
     { 
		 int a=5, b=4;
       System.out.println(a); 
       System.out.println(b); 
     } 
     public static void main(String[] args) 
     { 
    	 InstanceNonParameter obj=new InstanceNonParameter(); 
      obj.details();
     }
}
