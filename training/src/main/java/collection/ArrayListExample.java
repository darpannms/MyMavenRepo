package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> d=new ArrayList<String>(); 
	        d.add("blue"); 
	        d.add("green"); 
	        d.add("white"); 
	        d.add("black"); 
	        d.add("blue"); 
	        d.add("red"); 
	        System.out.println(d); 
	        ArrayList<String> n=new ArrayList<String>(); 
	        n.add("Yellow"); 
	        n.add("orange"); 
	        System.out.println(n); 
	        System.out.println(d.addAll(n)); 
	        System.out.println(d); 
	        System.out.println(d.contains("blue")); 
	        System.out.println(d.get(3)); 
	        System.out.println(d.isEmpty()); 
	        d.remove(0); 
	        System.out.println(d); 
	        System.out.println(d.size());
	}

}
