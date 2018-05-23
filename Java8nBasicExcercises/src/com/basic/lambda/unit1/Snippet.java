package com.basic.lambda.unit1;

import java.util.Collection;

interface Snippet {
	Collection<Integer> getCollection();
	default Integer getLargestAmt(){
		return null;
	}
	
}

