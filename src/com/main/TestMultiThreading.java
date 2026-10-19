package com.main;

public class TestMultiThreading {

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 =  
			() -> {
				for(int i=0;i<=5;i++) {
				System.out.println("Employee Thread   :  "+ Thread.currentThread().getName());
				}
		};

		Runnable r2 = 
					() -> {
						for(int i=0;i<=3;i++)
						System.out.println("Manager Thread   :  "+ Thread.currentThread().getName());
					
				};
		
		
				Thread t1 = new Thread(r1,"thread 1");						
				Thread t2 = new Thread(r2,"thread 2");
				
				t1.start();
			t1.join();
				t1.sleep(3000);
				t2.start();
	}

}
