package com.ikm;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class JavaStreams5FiletoString {
	
	public static void main(String[] args) throws IOException {


		Stream<String> band = Files.lines(Paths.get("Bands.txt"));
		band.sorted(Comparator.reverseOrder()).filter(e -> e.contains("ttu")).forEach(System.out::println);
		band.close();
	}
	

}
