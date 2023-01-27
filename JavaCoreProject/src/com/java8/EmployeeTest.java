package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {
	
		List<Employee>arremp=new ArrayList<Employee>();
		
		arremp.add(new Employee("Sudhansu",8900000));
		
		arremp.add(new Employee("durgaclas",11000000));
		arremp.add(new Employee("ramesh",9900000));
		arremp.add(new Employee("mahesh",6900000));
		arremp.add(new Employee("Suresh",8900000));
		arremp.add(new Employee("Himanshu",30000));
		
		
		Predicate<Employee>p=(e)->e.salary>50000;
		
		for(Employee e1:arremp) {
			
			if(p.test(e1)) {
				
				System.out.println(e1.name+":"+e1.salary);
				
				
			}
		}
		
		
		
		
		
	}

}
