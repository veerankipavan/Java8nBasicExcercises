package com.ikm;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams2MapFlatMapExample {
	
	public static void main(String[] args) {
	List<Person> list1= Arrays.asList(
			new Person("Charles","Dickens",45),
			new Person("Lewis","Caroll",35),
			new Person("Thomas","Carlyle",25),
			new Person("Chalotte","Bronte",32),
			new Person("Mathew","Arnold",42)
			);

	list1.stream().sorted(Comparator.comparing(Person::getAge)).filter(e -> e.getLastName().startsWith("C")).findFirst().ifPresent(System.out::println);

		List<Integer> age = list1.stream().map(e -> e.getAge()).collect(Collectors.toList());

		int[] calage = age.stream().mapToInt(e -> e).toArray();
		Arrays.stream(calage).map(e -> e*e).average().ifPresent(System.out::println);

	}
	

}
