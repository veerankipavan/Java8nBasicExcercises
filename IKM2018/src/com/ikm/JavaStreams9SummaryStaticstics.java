package com.ikm;


import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams9SummaryStaticstics {
	
	public static void main(String[] args) throws IOException {

		System.out.println(IntStream.of(1,2,3,4).summaryStatistics());
	}
	

}
