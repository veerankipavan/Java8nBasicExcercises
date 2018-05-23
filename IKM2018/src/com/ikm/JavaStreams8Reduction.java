package com.ikm;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams8Reduction {
	
	public static void main(String[] args) throws IOException {

		double vals[] = {10.5, 11.5};
		System.out.println(Arrays.stream(vals).reduce(10,(a,b) -> a+b ));
	}
	

}
