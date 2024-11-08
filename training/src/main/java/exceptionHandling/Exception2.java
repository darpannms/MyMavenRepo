package exceptionHandling;

public class Exception2 {
	
	 public void display() 
	 	{ 
	 		 
	 		int a=10; 
	 		try 
	 		{ 
	 		int b=a/0; 
	 		System.out.println(b); 
	 		} 
	 		catch(ArithmeticException e) 
	 		{ 
	 			System.out.println("Cannot divide by zero"); 
	 		}
	 		finally 
	 		{ 
	 			System.out.println("Exception handled"); 
	 		}
	 		 
	 	} 
	  
	 	public static void main(String[] args) { 
	 		// TODO Auto-generated method stub 
	 Exception2 obj=new Exception2(); 
	 	 obj.display(); 
	  
	 	}

}
