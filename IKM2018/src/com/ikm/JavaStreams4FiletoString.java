package com.ikm;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class JavaStreams4FiletoString {
	
	public static void main(String[] args) throws IOException {

		/*Path currentDir = Paths.get(".");
		System.out.println(currentDir.toAbsolutePath());
		currentDir = Paths.get("Bands.txt");
		System.out.println(currentDir.toAbsolutePath());*/

		Stream<String> band = Files.lines(Paths.get("Bands.txt"));
		band.sorted(Comparator.reverseOrder()).filter(e -> e.length()>5 ).forEach(System.out::println);
		band.close();
	}
	

}
