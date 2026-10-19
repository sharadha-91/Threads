package com.threads;

public class MyThread1 extends Thread
{
  public void run() {
		  try {
			Thread.sleep(3000);
			System.out.println("run: " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }
}
