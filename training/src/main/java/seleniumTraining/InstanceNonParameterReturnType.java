package seleniumTraining;

public class InstanceNonParameterReturnType {
	public  int details() 
	    { 
	    	int age=18; 
	    	return age; 
	       
	       
	    } 
	    public static void main(String[] args) 
	    { 
	       InstanceNonParameterReturnType obj=new InstanceNonParameterReturnType(); 
	       int x=obj.details(); 
	       System.out.println(x); 

	    }


	
}