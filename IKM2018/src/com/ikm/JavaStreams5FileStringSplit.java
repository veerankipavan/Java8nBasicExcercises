package com.ikm;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams5FileStringSplit {
	
	public static void main(String[] args) throws IOException {


		Stream<String> band = Files.lines(Paths.get("TeechChallengeData.txt"));
		//band.map(e -> e.length()).filter(e -> e.intValue()<10).forEach(System.out::println);
		band.filter(e -> e.length()<10).collect(Collectors.toList()).forEach(System.out::println);
		band.close();
	}
	

}
