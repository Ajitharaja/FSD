package Collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;  
public class Encapsulation{  
		 
			    public static void main(String[] args){  
			        long startTime = System.currentTimeMillis();  
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
                for (int i=0; i<100000; i++){  
        	 list.add("AJEETHA");
        	 list.add("RITHIKA");
        	 list.remove(0);
        	 
        }  
        System.out.println("Time taken by ArrayList: " +
        (System.currentTimeMillis() - startTime) + "ms");  
        //------------------------------------------------------------
          startTime = System.currentTimeMillis();  
        LinkedList<String> ll=new LinkedList<String>();  
           for (int i=0; i<100000; i++){  
        	   ll.add("ANU");
          	 ll.add("CIBI");
          	 ll.remove(0);
        }  
        System.out.println("Time taken by LinkedList: " + 
        (System.currentTimeMillis() - startTime) + "ms");  
   			    }  	

	}  
