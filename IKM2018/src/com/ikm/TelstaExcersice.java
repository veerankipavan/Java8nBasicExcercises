package com.ikm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;


public class TelstaExcersice
{
    public static void main(String[] args) {

        String str = "I am writing a new programme hello test, and I want to print repeated words";
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("hello");
        list.add("hello");
        list.add("test");

        getLista(str,list);



    }

    public  static List<String> getLista(String str, List<String> list) {

        String[] splitStr = str.split(" ");

         Arrays.stream(splitStr).filter(e -> !list.contains(e)).
                collect(Collectors.groupingBy(w -> w, counting())).entrySet().stream().filter(e -> e.getValue()>=2).map(e -> e.getKey()).forEach(System.out::println);



        return null;
    }


}
