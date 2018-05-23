package com.ikm;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaStreamSortFilter {
	
	public static void main(String[] args) {
	List<Person> list1= Arrays.asList(
			new Person("Charles","Dickens",45),
			new Person("Lewis","Caroll",35),
			new Person("Thomas","Carlyle",25),
			new Person("Chalotte","Bronte",32),
			new Person("Mathew","Arnold",42)
			);

	list1.stream().sorted(Comparator.comparing(Person::getAge)).filter(e -> e.getLastName().startsWith("C")).findFirst().ifPresent(System.out::println);

//		ArrayList<String> list = new ArrayList<>();
//		list.add("test");
//		list.add("test");
//		list.add("hello");
//		list.add("test");
//
//		Map<String, Long> occurrences = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//
//		occurrences.entrySet().stream().forEach(System.out::println);
//
//		System.out.println( "Occurences "+occurrences.entrySet().stream());
//		String mostRepeatedWord
//				= list.stream()
//				.collect(Collectors.groupingBy(w -> w, Collectors.counting()))
//				.entrySet()
//				.stream()
//				.max(Comparator.comparing(Map.Entry::getValue))
//				.get()
//				.getKey();
//		System.out.println( "mostRepeatedWord "+mostRepeatedWord);
	}
	

}
