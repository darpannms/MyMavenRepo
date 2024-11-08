package interfaceExample;

public class MultipleInheritance3 implements MultipleInheritance1,MultipleInheritance2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance3 obj=new MultipleInheritance3();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() {
		System.out.println("1");
		
	}

	@Override
	public void display() {
		System.out.println("2");
		
		
	}

}
