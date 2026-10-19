package com.main;

public class ManualThreadExecution {

	public static void main(String[] args) throws InterruptedException {

		//Loan Apply
		//Credit score  - thread 1
		//Employment Verification - thread 2
		//Loan History
		//Fraud Detection
		
		Thread creditScoreThread = new Thread(()->{
			System.out.println(10/0);
			System.out.println("Credit checking : " + Thread.currentThread().getName());
		});
		
		Thread employmentThread = new Thread(()->{
			System.out.println("Employment checking : " + Thread.currentThread().getName());
		});
		
		creditScoreThread.start();
		employmentThread.start();
		
		creditScoreThread.join();
		employmentThread.join();
		
		//Manual error handling
		//Thread/Resource Management
		//Manually we need to create a Thread, start a thread, everthing we need to do manually
		
		
		
		
	}

}
