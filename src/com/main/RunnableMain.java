package com.main;

import com.threads.MyRunnable1;
import com.threads.MyThread1;

public class RunnableMain {

	public static void main(String[] args) throws InterruptedException {

		MyRunnable1  runnable = new MyRunnable1();
		Thread t = new Thread(runnable);
		t.start();
		
		for(int i=1;i<=4;i++) {
			System.out.println(" Main : Runnable "+ Thread.currentThread().getName());
		}
		
	}

}
