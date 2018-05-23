package com.ikm;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMostRepeatedWord {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
		list.add("test");
		list.add("test");
		list.add("hello");
		list.add("test");

		 list.stream()
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() >2 ).map(k -> k.getKey()).forEach(System.out::println);

		//System.out.println( "mostRepeatedWord "+mostRepeatedWord);


    }
}
