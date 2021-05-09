package com.dnyanesh.java8.lambdas;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnin");
			}
		}); 
		
		myThread.run();
		
		Thread myThreadlambda = new Thread(()->System.out.println("Runnin"));
		myThreadlambda.run();
	}

}
