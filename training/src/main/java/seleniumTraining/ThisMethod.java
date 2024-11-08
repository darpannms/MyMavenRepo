package seleniumTraining;

public class ThisMethod {

	void show() 
		{ 
			System.out.println("hello m"); 
		}   
		void display() 
		{   
		System.out.println("hello n");   
		  
		this.show();  
		//show();//IDE will apply 'this.' automatically
		}   
		   
		 
		public static void main(String args[]) 
		{   
			ThisMethod  a=new ThisMethod ();   
		a.display();   
		}
	

}
