package superPackage;

public class SuperMethod2 extends SuperMethod1 {
	 public void show() 
	 	{ 
	 		super.show(); 
	 		System.out.println("java"); 
	 	}
	public static void main(String[] args) {
	
		SuperMethod2  obj=new  SuperMethod2 (); 
		 obj.show();

	}

}
