package com.basic.lambda.unit1;

import java.util.*;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class CollectionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list= Arrays.asList("dog","over","good");
		
		//System.out.print(list.stream().reduce( new String(),(s1,s2)-> {if(s1.equals("dog"))return s1;return s2;}));

		Supplier<String> i = ()-> "Car";
		Consumer<String> c = x-> System.out.print(x.toLowerCase());
		Consumer<String> d = x->  System.out.print(x.toUpperCase());
		c.andThen(d).accept(i.get());
		System.out.println();
	
	}

}
