package com.vrsa9208.console;

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		LongWrapper longWrapper = new LongWrapper(0L);
		
		Runnable runnable = () -> {
			for (int i = 0; i < 1_000 ; i++) {
				longWrapper.incrementValue();
			}
		};
		
		Thread[] threads = new Thread[1_000];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(runnable);
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
		//The result should be 1,000,000. But it won't be like that. 
		//It'll variate for each execution.
		System.out.println("Value = " + longWrapper.getValue());
	}
}
