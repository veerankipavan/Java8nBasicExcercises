package com.basic.lambda.unit3;

public class MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread trd = new Thread(MethodReferences::printMessage);
		trd.start();

	}
	
	public static void printMessage(){
		System.out.println("Print Message");
	}

}
