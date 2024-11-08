package Inheritance;

public class BabyDog extends Dog{

	 public void display() 
	 	{ 
	 	 
	 	System.out.println("hello"); 
	 	}
	 public static void main(String[] args) {
		BabyDog obj = new BabyDog ();
		obj.show();
		obj.display();
	}
	}