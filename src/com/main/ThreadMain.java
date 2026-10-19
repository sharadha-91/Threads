package com.main;

import com.threads.MyRunnable1;
import com.threads.MyThread1;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());
		
		MyThread1 t1 = new MyThread1();
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getState());
		System.out.println(t1.getState());
		
		t1.join();
		System.out.println(t1.getState());	
		System.out.println(Thread.activeCount());
		
		
	}

}
