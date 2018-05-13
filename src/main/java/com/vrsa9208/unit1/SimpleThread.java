package com.vrsa9208.unit1;

public class SimpleThread {
	public static void main(String[] args) {
		Runnable runnable = () -> 
			System.out.println("Thread name: " + Thread.currentThread().getName());

		Thread thread0 = new Thread(runnable);
		//I can change the name of the thread with the setName method
		//thread1.setName("my-thread");
		thread0.start();

		Thread thread1 = new Thread(runnable);
		thread1.start();

		// If I use the run method on thread, it'll be executed in the main thread.
		// Do not do this
		thread1.run();
	}
}
