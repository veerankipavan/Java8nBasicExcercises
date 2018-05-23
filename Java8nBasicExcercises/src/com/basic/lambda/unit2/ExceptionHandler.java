package com.basic.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandler {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int key=0;
		process(numbers,key,wrapperExcetion((i,j)->System.out.println(i/j)));
	}
	
	public static void process(int[] nums,int j,BiConsumer<Integer, Integer> biconsumer){
		for(int i:nums){
			biconsumer.accept(i,j);
		}
	}
	
	public static BiConsumer<Integer,Integer> wrapperExcetion(BiConsumer<Integer, Integer> biconsumer){
		return (m,n) -> {
			try{
			biconsumer.accept(m,n);
			}
			catch(Exception e){
				System.out.println("Arithmatic Excpetion");
			}
			};
	}
	

}
