package exp.gibin.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

//Asynchronus calls in java 8
/*
 * Check thread pool or forkjoin pool
 * 
 * */

public class TestCompletebleFuture {

	public static void main(String[] args) {
		// example 1 blocking call
		try {
			
			CompletableFuture<String> completableFuture = new CompletableFuture<String>();

			completableFuture.complete("Future's Result");
			//blocking call working in a separate thread
			String result = completableFuture.get();
			System.out.println("Result "+result);
		
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		//example 2 asynchrounous call running back ground and return nothing
		
		CompletableFuture<Void> fututre = CompletableFuture.runAsync(new Runnable() {
			
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(1);
				}
				catch(Exception e)
				{
					throw new IllegalStateException();
				}
				System.out.println("In a separate thread");
			}
		});
		try {
			
			//blocking call working in a separate thread
			fututre.get();
			System.out.println("Completed");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		// example 3 asynchronus call running back ground and return some
		try {
		CompletableFuture<String> asyncreturnFuture = CompletableFuture.supplyAsync(new Supplier<String>() {

			public String get() {
				
				return "Async Call Complete";
			}
		});
		String asyncOut = asyncreturnFuture.get();
			System.out.println(asyncOut);
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}
