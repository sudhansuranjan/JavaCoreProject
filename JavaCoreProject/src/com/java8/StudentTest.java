package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentTest {

	public static void main(String[] args) {
	
		
		Function<Student, String>f=(s1)->{
			int marks=s1.marks;
			String grades="";
			
			if(marks>=80) grades="A[Distinction]";
			else if(marks>=60) grades="B[First Class]";
			else if(marks>=50) grades="c[Second Class]";
			else if(marks>=35) grades="D[Third Class]";
			else grades="E[Failed ]";
			return grades;
			
		};
		
		List<Student>sarray=new ArrayList<Student>();
		sarray.add(new Student("Mahesh", 50));
		sarray.add(new Student("Sudhansu", 90));
		sarray.add(new Student("Kailseh", 30));
		sarray.add(new Student("Ramesh", 40));
		sarray.add(new Student("Umesh", 61));
		
		for(Student s2:sarray) {
			
			System.out.println("Student name"+s2.name);
			System.out.println("Student Marks"+s2.marks);
			System.out.println("Student Grades"+f.apply(s2));
		}
		
	}

}
