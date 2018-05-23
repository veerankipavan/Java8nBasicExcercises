package com.basic.lambda.unit1;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

class  B   {

	
	 
	 public static void main(String[] args) {
		 YearMonth mon=YearMonth.now();
		 YearMonth mon2=YearMonth.of(2017, Month.APRIL);
			System.out.println(mon2.until(mon, ChronoUnit.MONTHS));
			System.out.println(mon.minus(Period.ofMonths(4)).getMonthValue());

	 }
	

}
