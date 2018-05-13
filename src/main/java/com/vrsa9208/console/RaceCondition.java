package com.vrsa9208.console;

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		LongWrapper longWrapper = new LongWrapper(0L);
		
		Runnable runnable = () -> {
			for (int i = 0; i < 1_000 ; i++) {
				longWrapper.incrementValue();
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		//Waits for the thread until it finishes its execution to continue
		thread.join();
		
		System.out.println("Value = " + longWrapper.getValue());
	}
}
