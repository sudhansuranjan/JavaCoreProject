package com.java8;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		
		
		 ArrayList<String>arrlist=new ArrayList<String>();
	        
	        arrlist.add("Ram");
	         arrlist.add("Shyam");
	          arrlist.add("Mahesh");
	          
	          arrlist.forEach((n)->{
	          System.out.println(n);
	          }
	          );
	    
	}

}
