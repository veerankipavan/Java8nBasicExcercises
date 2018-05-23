package com.basic.lambda.unit1;

import java.util.LinkedList;
import java.util.List;

public class IKMTest {

	public IKMTest(){
		this(10);
	};
	
	public IKMTest(int data){
		this.data=data;
	};
	
	public void display(){
		class Decrementer{
			public void decrement(){
				data--;
			}
					}
		Decrementer d = new Decrementer();
		d.decrement();
		System.out.println(data);
		
	}
	private int data;
	
	public static void main(String[] arg){
		int data=0;
		IKMTest t = new IKMTest();
		
		t.display();
		System.out.println(data);
	}
	
	
	
	
}
