package seleniumTraining;

public class InstanceParameter {
	 public  void details(int a, int b) 
     { 
		 //int a=5, b=4;
       System.out.println(a); 
       System.out.println(b); 
     } 
     public static void main(String[] args) 
     { 
    	 InstanceParameter obj=new InstanceParameter(); 
      obj.details(5,4);
     }
}
