package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		List <String> namelist = new ArrayList<String>();
		
		namelist.add("virat");
		namelist.add("Sachin");
		namelist.add("Rohit");
		namelist.add("Surya");
		namelist.add("Jadhav");
		
		for(String name: namelist) {
			
			System.out.println(" "+name);
		}
		
		
	}
	
	
	public static void main5(String[] args) {
		
		TreeSet a1 = new TreeSet();
		

		a1.add(10);
		a1.add(5);
		a1.add(23);
		a1.add(7);
		a1.add(45);
		a1.add(18);
		
		
		System.out.println(a1);
			
		
	} // tree set ends here 
	
	
	public static void main2(String[] args) {
		
		LinkedList a1 = new LinkedList();
		
		
		
		a1.add(10);
		a1.add(5);
		a1.add(23);
		a1.add(7);
		a1.add(45);
		a1.add(18);
		
		
		for(int i=0;i<a1.size();i++) {
			
			System.out.println(a1.get(i));
		
		}
		
	}// linked list ends here
	
	
	
	

	public static void main1(String[] args) {
		
		
		
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(5);
		a1.add(23);
		a1.add(7);
		a1.add(45);
		a1.add(18);
		
		
		for(int i=0;i<a1.size();i++) {
			
			System.out.println(a1.get(i));
		}

	}// arraylist ends here

}
