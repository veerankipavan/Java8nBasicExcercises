package com.basic.lambda.unit1;

import java.util.LinkedList;
import java.util.List;

public class Indices {

	public String s;
	public List<Integer> indices;
	
	public Indices(String s){
		this.s=s;
		indices= new LinkedList<>();
		for(int i=0;i<this.s.length();++i){
			indices.add(i);
		}
	}
	
	
}
