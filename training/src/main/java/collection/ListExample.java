package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<String>(); 
 		list.add("Red"); 
 		list.add("Blue"); 
 		list.add("Green"); 
 		Iterator itr=list.iterator(); 
 		while(itr.hasNext()) 
 		{ 
 			System.out.println(itr.next()); 
 		} 
  
 	}
	}
