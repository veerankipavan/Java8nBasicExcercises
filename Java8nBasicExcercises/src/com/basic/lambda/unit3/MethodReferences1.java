package com.basic.lambda.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.basic.lambda.unit1.Person;

public class MethodReferences1 {

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
				Collections.sort(list, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
				
				//Step 2: Print all elements
				System.out.println("Printing All");
				printConditionally(list, p->true,System.out::println);
			
				

	}
	
	private static void printConditionally(List<Person> list, Predicate<Person> predicate,Consumer<Person> consumer){
		for(Person p:list){
			if(predicate.test(p))
			consumer.accept(p);;
		}
		
	}
	
	public static void printMessage(){
		System.out.println("Print Message");
	}

}


