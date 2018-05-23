package com.ikm;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams7FiletoMap {
	
	public static void main(String[] args) throws IOException {


		Stream<String> band = Files.lines(Paths.get("TeechChallengeData.txt"));
		band.skip(1).map(e -> e.split(",")).filter(e -> e.length<3).
				collect(Collectors.toMap(e -> e[0],e -> e[1])).entrySet().forEach(e -> System.out.println(e.getKey()+ "--" + e.getValue()));

		//band.filter(e -> e.length()>10).filter();
		band.close();
	}
	

}
