package superPackage;

public class SuperVariable2 extends SuperVariable1 {
	String Name= "def";
	 public void show() 
	 { 
	 	System.out.print(super.Name); 
	 	System.out.println(Name); 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SuperVariable2 obj=new SuperVariable2(); 
	 		obj.show();
	}

}
