package com.basic.lambda.unit1;

public class RunnabaleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread mythread = new Thread( new Runnable(){

			@Override
			public void run() {
				System.out.println("System execute Runnable");
				
			}
			
		});
		
		mythread.run();		
		Thread lambdaThread= new Thread(()-> System.out.println("Execute Lambda Thread"));
		lambdaThread.run();
	}
	
	

}
