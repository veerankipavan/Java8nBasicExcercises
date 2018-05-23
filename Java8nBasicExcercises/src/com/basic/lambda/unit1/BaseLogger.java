package com.basic.lambda.unit1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.function.Function;
import java.util.function.Predicate;

public class BaseLogger {
	


//	public static void main(String[] args) {
//		Predicate<String> length= (s)->s.length()<2;
//		Predicate<String> equiliser= Predicate.isEqual("Car");
//		Function<Boolean, String> booleanr= i -> Boolean.toString(i);
//
//		Function<String, Boolean> stringer= s -> Boolean.parseBoolean(s);
//	System.out.println(booleanr.compose(stringer).apply("true").substring(0,3));
//	//System.out.println(booleanr.andThen(stringer).apply("true"));
//	System.out.println(stringer.compose(booleanr).apply(true));
//	System.out.println(booleanr.apply(true));
//	System.out.println(length.negate().or(equiliser).prepexercises("CAR"));
//	}
	
	private static BaseLogger log= new BaseLogger();
	private BaseLogger(){	}
	
	public synchronized static BaseLogger getInstance(){
		return log;
	}
	
	private StringBuilder logmessage = new StringBuilder();
	public void addLog(String logMessage){
		this.logmessage.append(logmessage+"|");
		
	}
	public void printlog(){
		System.out.println(logmessage.toString());
	}
	
}

