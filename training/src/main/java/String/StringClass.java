package String;

public class StringClass {
	public void StringLiteral() 
 	{ 
 		String s="hai"; 
 		System.out.println(s); 
 	}

	public void StringNew() 
 	{ 
 		String s=new String("hello"); 
 		System.out.println(s); 
 	}
	
	public void StringLength() 
 	{ 
 		String s="hai"; 
 		System.out.println(s.length()); 
 	}
	
	public void StringSubString() 
 	{ 
 		String s="helloworld"; 
 		System.out.println(s.substring(2, 4)); 
 	}
	
	 public void StringContains() 
	 	{ 
	 		String s="java is a programming language"; 
	 		System.out.println(s.contains("Java is")); 
	 	}
	 
	 public void StringIsEmpty() 
	 	{ 
	 		String s1=""; 
	 		String s="hai"; 
	 		System.out.println(s1.isEmpty()); 
	 		System.out.println(s.isEmpty()); 
	 		 
	 		 
	 	}
	 
	 public void StringEquals() 
	 	{ 
	 		String s="hai"; 
	 		String s1="Hai"; 
	 		System.out.println(s.equals(s1)); 
	 	}
	 
	 public void StringEqualsEgnoreCase() 
	 	{ 
	 		String s="hai"; 
	 		String s1="Hai"; 
	 		System.out.println(s.equalsIgnoreCase(s)); 
	 	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 		StringClass obj=new StringClass();
	 		//obj.StringLiteral();
	 		//obj.StringNew();
	 		//
	 		//obj.StringSubString();
	 		//obj.StringContains();
	 		//obj.StringIsEmpty();
	 		//obj.StringEquals();
	 		obj.StringEqualsEgnoreCase();
	 	}
	}


