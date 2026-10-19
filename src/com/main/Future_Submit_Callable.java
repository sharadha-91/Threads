package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Future_Submit_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Future<List<Integer>> future =service.submit(()->{
				
			return Arrays.asList(1,2,3,4);
		});
		
		List<Integer> list = future.get();
		System.out.println("List " + list); 
	}

}
