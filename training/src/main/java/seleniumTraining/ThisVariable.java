package seleniumTraining;

public class ThisVariable {

	String name;   
     
	ThisVariable(String name){   
		  
		this.name=name;   
		 
		}   
		void display()
		{ 
			System.out.println(name);
		}   
		   
		  
		public static void main(String args[])
		{   
			   
			ThisVariable s=new ThisVariable("sumit");   
		      
		    s.display();   


     } 

}
