package com.basic.lambda.unit1;

public class Greeter {

	
	public static void main(String[] args) {
		
		String str1= "My String";
		String str2= new String("My String");
		
	
		System.out.println(str1==str2);
		System.out.println(str1.hashCode()==str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str1.matches(str2));
		
		int x=5;
		
		System.out.println(x=x>>1);
		System.out.println(x=~x);
		System.out.println(x+=3);	
		//System.out.println(x=!x);
		
	}
	
	public Integer getNumber(){
		return 2;
	}
	
	public void setNumber(Integer n){
		
	}

}
