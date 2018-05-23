package com.java7.topics;

import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExample {

    public static void  pathInfo() {

        Path path= Paths.get("Bands.txt");

        System.out.println("Number of Nodes:"+ path.getNameCount());

        System.out.println("File Name:"+ path.getFileName());

        System.out.println("File Root:"+ path.getRoot());

        System.out.println("File Parent:"+ path.getParent());

    }

    public static void main(String args[]) {
        pathInfo();
    }
}
