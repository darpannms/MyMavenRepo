package Inheritance;

public class Department2 extends College{

	 public void view() 
	 	{ 
	 	 
	 	System.out.println("hi"); 
	 	}
	 public static void main(String[] args) {
		 Department2 obj = new Department2 ();
		obj.show();
		obj.view();
		Department1 obj1 = new Department1 ();
		obj1.display();
		obj1.show();
	}
	}