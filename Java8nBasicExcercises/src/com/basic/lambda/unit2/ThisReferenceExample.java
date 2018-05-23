package com.basic.lambda.unit2;

public class ThisReferenceExample {

	public void doPorcess(int i,Process p){
		p.process(i);
		
	}
	
	public void execute(){
		doPorcess(10, 
			p -> {
				System.out.println(p+10);
				System.out.println(this);
		}
		);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReferenceExample thisrefexp= new ThisReferenceExample();
		thisrefexp.execute();
//		thisrefexp.doPorcess(10, 
//				p -> {
//					System.out.println(p+10);
//					System.out.println(this);
//			}
//			);

	}

	@Override
	public String toString() {
		return "ThisReferenceExample ";
	}

}
