package com.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LoanApplicationExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		//Creditscore - thread
		Future<String> creditScore = service.submit(() -> {
			
			System.out.println("Checking credit score" + Thread.currentThread().getName());
			Thread.sleep(100);
			return "Credit score : Good";
		});
		//employment verification - thread
        Future<String> employementVerification = service.submit(() -> {
			
			System.out.println("Employement verification score" + Thread.currentThread().getName());
			Thread.sleep(100);
			return "Employement verification score : Approved";
		});
		
        String creditCheck = creditScore.get();
        String employCheck = employementVerification.get();
        
        System.out.println(creditCheck);
        System.out.println(employCheck);
        
        service.shutdown();
        //Manula error handling
        //Resource Management
        
	}

}
