package com.ikm;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String args[]) {

        IntStream.range(0, 10).skip(5).forEach(System.out::println);

    }
}
