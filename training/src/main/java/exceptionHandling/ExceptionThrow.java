package exceptionHandling;

public class ExceptionThrow {
	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		 
 	int age=16; 
 	if(age>18) 
 	{ 
 		System.out.println("Eligible"); 
 	} 
 	else 
 	{ 
 		throw new 	ArithmeticException("Not eligible"); 
 	} 
 	}

}
