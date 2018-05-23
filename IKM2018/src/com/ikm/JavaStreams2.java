package com.ikm;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams2 {

    public static void main(String args[]) {
        Stream.of("Kranthi", "Kiran", "Kittu").sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);

    }
}
