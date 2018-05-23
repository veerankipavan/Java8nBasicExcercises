package com.ikm;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;


public class SteamExample1
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

      //  List<String> lista = occurrences.keySet().stream().collect(Collectors.toList());

      /*  Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        // split a map into 2 List
        List<Integer> resultSortedKey = new ArrayList<>();
        List<String> resultValues = map.entrySet().stream()
                //sort a Map by key and stored in resultSortedKey
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .peek(e -> resultSortedKey.add(e.getKey()))
                .map(x -> x.getValue())
                // filter banana and return it to resultValues
                .filter(x -> !"banana".equalsIgnoreCase(x))
                .collect(Collectors.toList());

        resultSortedKey.forEach(System.out::println);
        resultValues.forEach(System.out::println); */


    }

    public  static List<String> getLista(String str, List<String> list) {

        String[] splitStr = str.split(" ");

        Map<String, Long> occurrences = Arrays.stream(splitStr).filter(e -> !list.contains(e)).collect(Collectors.groupingBy(w -> w, counting()));

     // List<Long>    occurrence = Arrays.stream(splitStr).filter(e -> !list.contains(e)).collect(Collectors.groupingBy(counting());

        // Arrays.stream(splitStr).filter(e -> !list.contains(e)).map(k -> k ,Collectors.groupingBy(e-> e, counting()));

        Arrays.stream(splitStr).collect(counting());

        List<String> lista = occurrences.entrySet().stream().filter(e -> e.getValue() >= 2).map(k -> k.getKey()).collect(Collectors.toList());

        lista.forEach(System.out::println);

        System.out.println( "Counting Example :"+Arrays.stream(splitStr).collect(counting()));

        return lista;
    }


}
