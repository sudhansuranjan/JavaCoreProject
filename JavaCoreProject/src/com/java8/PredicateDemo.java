package com.java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		String[]s2= {"sunny","Ramesh","Sudhansu","javatpoint"};
		
		Predicate<String>p=(s)->s.length()>5;  
		
		for(String s1:s2) {
			
			if(p.test(s1))
			System.out.println(s1);
			
		}

	}

}
