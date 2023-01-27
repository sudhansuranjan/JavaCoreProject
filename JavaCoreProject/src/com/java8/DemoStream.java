package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {
	
		
		List<String> cofees=List.of("cappuccino","Americano","espresso","cortado","moocha","cappuccino","flat white","latte");
		
		List<String>cofeesendingIno=cofees.stream()
				                    .distinct()
				                    .sorted()
				                    .filter(s->s.endsWith("o"))
				                    .collect(Collectors.toList());
		
		System.out.println(cofeesendingIno);
		
		
		
		//Sudhansu fetch//pull
		
		

	}

}
