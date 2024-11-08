package Inheritance;

public class Child extends Parent{

	 public void display() 
	 	{ 
	 	 
	 	System.out.println("hi"); 
	 	}
	 public static void main(String[] args) {
		Child obj = new Child ();
		obj.show();
		obj.run();
		obj.display();
	}
	}