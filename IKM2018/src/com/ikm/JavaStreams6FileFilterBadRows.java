package com.ikm;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams6FileFilterBadRows {
	
	public static void main(String[] args) throws IOException {


		Stream<String> band = Files.lines(Paths.get("TeechChallengeData.txt"));
		band.skip(1).map(e -> e.split(",")).filter(e -> e.length>2).filter( a -> Double.parseDouble(a[2]) > 300).forEach(e -> System.out.println(e[0]+" -- "+ e[1]+" -- " +e[2]));
		//band.filter(e -> e.length()>10).filter();
		band.close();
	}
	

}
