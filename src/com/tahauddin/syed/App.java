package com.tahauddin.syed;
/**
 * 
 * @author Syed Tahauddin
 *
 */

public class App {

	public static void main(String[] args) {
		
		MyThread runnable = new MyThread();
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		Thread thread4 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
