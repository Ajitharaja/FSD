package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashSet<String> set=new HashSet<String>();  
		set.add("ajee");  
		set.add("renu");  
		set.add("preet");  
		set.add("kathir");  
		set.add(hari);
		set.add("lingesh");
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  */
		
		System.out.println("\nLinked Hashset");
		//LinkedHashSet
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("renu");  
		set1.add(null);  
		set1.add("preet");  
		set1.add("Ajee");  
		Iterator<String> itr1=set1.iterator();  
		while(itr1.hasNext()){  
			System.out.println("....");
		System.out.println(itr1.next());  
		}  

	}

}
