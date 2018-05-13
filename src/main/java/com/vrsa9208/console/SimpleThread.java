package com.vrsa9208.console;

public class SimpleThread {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
