package com.basic.lambda.unit2;

public class Closures {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		doprocess(i,p -> System.out.println(p+j));
	}
	
	public static void doprocess(int j,Process p){
		p.process(j);
	}
	
	
}

interface Process{
	void process(int j);
}
