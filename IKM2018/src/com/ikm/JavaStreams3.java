package com.ikm;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams3 {
	
	public static void main(String[] args) {
	List<Person> list1= Arrays.asList(
			new Person("Charles","Dickens",45),
			new Person("Lewis","Caroll",35),
			new Person("Thomas","Carlyle",25),
			new Person("Chalotte","Bronte",32),
			new Person("Mathew","Arnold",42)
			);

		list1.stream().map(p -> {
			return new Person(p.getFirstName().toLowerCase(),p.getLastName(),p.getAge());
//			Person o = new Person();
//			o.setAge(p.getAge());
//			o.setFirstName(p.getFirstName().toLowerCase());
//			o.setLastName(p.getLastName());
//			return o;

		}).filter(k -> k.getFirstName().startsWith("l")).forEach(System.out::println);


	}
	

}
