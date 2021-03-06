package com.basic.lambda.unit3;

import java.util.Arrays;
import java.util.List;

import com.basic.lambda.unit1.Person;

public class StreamExample {
	
	public static void main(String[] args) {
	List<Person> list= Arrays.asList(
			new Person("Charles","Dickens",45),
			new Person("Lewis","Caroll",35),
			new Person("Thomas","Carlyle",25),
			new Person("Chalotte","Bronte",32),
			new Person("Mathew","Arnold",42)
			);
	list.stream().filter(p-> p.getLastName().startsWith("C")).forEach(System.out::println);
	}
	

}
