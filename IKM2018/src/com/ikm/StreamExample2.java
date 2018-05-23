package com.ikm;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String args[])
        {
                List<String> uris = new ArrayList<>();
                uris.add("C:\\My.txt");
                Stream<Path> stream = uris.stream().map(uri -> Paths.get(uri));

            stream.forEach(System.out::println);
        }
    }
