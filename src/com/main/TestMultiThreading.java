package com.main;

public class TestMultiThreading {

	public static void main(String[] args) throws InterruptedException {
      BrickLoad bl = new BrickLoad();
		Runnable r1 = () -> {
				for(int i=0;i<=10000;i=i+50) {
					bl.increementBrickCount();
				System.out.println("Labour 1   :  "+ Thread.currentThread().getName());
				}
		};

		Runnable r2 = () -> {
						for(int i=0;i<=15000;i=i+50) {
							bl.increementBrickCount();
						System.out.println("Labour 2   :  "+ Thread.currentThread().getName());				
						}
						};
		
		Runnable r3 = () -> {
							for(int i=0;i<=5000;i=i+50) {
								bl.increementBrickCount();
							System.out.println("Labour 3   :  "+ Thread.currentThread().getName());
							}
					};
					
					
					
				Thread t1 = new Thread(r1,"thread 1");						
				Thread t2 = new Thread(r2,"thread 2");
				Thread t3 = new Thread(r3,"thread 3");
				
				t1.start();				
				t2.start();				
				t3.start();
				
				t1.join();
				t2.join();
				t3.join();
				
				System.out.println(bl.brickCount);
	}

}
class BrickLoad{
	
	int brickCount =0;
	public synchronized void  increementBrickCount() {
		brickCount = brickCount +50;
		
	}
}


