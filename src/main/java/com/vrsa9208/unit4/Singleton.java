package com.vrsa9208.unit4;

public final class Singleton {
	
	private static volatile Singleton instance;
	private static Object key;
	
	private Singleton() { }
	
	public static Singleton getInstance() {
		if(instance != null) {
			return instance;
		}
		
		synchronized (key) {
			if(instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}
}
