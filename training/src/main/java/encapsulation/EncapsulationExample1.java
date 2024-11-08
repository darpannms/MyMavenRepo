package encapsulation;

public class EncapsulationExample1 {

	private int age; 
	 private String name; 
	  
	 public void setDetails(int age,String name) 
	 { 
	 	this.age=age; 
	 	this.name=name; 
	 	 
	 } 
	 public void getDetails() 
	 { 
	 	System.out.println(age+" "+name); 
	 }
	}