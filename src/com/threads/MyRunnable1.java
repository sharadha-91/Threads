package com.threads;

public class MyRunnable1 implements Runnable{

	@Override
	public void run() {

		  for(int i=1;i<=4;i++) {
			  System.out.println(" Runnable :" +Thread.currentThread().getName());
		  }
		
	}

}
