package Polymorphism;

public class MethodOverloading {

	public void show(int a) 
 	{ 
 		System.out.println(a); 
 	} 
 	public void show(String a) 
 	{ 
 		System.out.println(a); 
 	} 
 	public void show(String a,int b) 
 	{ 
 		System.out.println(a+""+b); 
 	} 
  
 	public static void main(String[] args) { 
 		MethodOverloading  obj=new MethodOverloading (); 
 		obj.show(5); 
 		obj.show("hai"); 
 		obj.show("java",5); 
 	}
	}
