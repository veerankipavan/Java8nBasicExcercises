package com.basic.lambda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExerciseSoutionJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list= Arrays.asList(
				new Person("Charles","Dickens",45),
				new Person("Lewis","Caroll",35),
				new Person("Thomas","Carlyle",25),
				new Person("Chalotte","Bronte",32),
				new Person("Mathew","Arnold",42)
				);
		
		// Step 1: Sort by Last name
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		
		});
		
		//Step 2: Print all elements
		System.out.println("Printing All");
		printall(list);
	
		// Step 3: Printing All  Last Name starting with C
		System.out.println("Printing All  Lastname starting with C");
		printConditionally(list, new Condition(){		
			public boolean test(Person p){
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("Printing All  Firstname starting with C");
		
		printConditionally(list, new Condition(){		
			public boolean test(Person p){
				return p.getFirstName().startsWith("C");
			}
			
		});
	}



	private static void printall(List<Person> list) {
		// TODO Auto-generated method stub
		for(Person p:list){
			System.out.println(p);
		}
		
	}
	
	

	
	
		private static void printConditionally(List<Person> list, Condition c){
			for(Person p:list){
				if(c.test(p))
				System.out.println(p);
			}
			
		}
		
}
interface Condition{
	boolean test(Person s);
}




