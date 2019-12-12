package exp.gibin.java8;

import java.awt.Dimension;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

//Asynchronus calls

public class TestCompletebleFuture {

	public static void main(String[] args) {
		// example 1
		try {
			
			CompletableFuture<String> completableFuture = new CompletableFuture<String>();

			completableFuture.complete("Future's Result");
			
			String result = completableFuture.get();
			System.out.println("Result "+result);
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//example 2
		
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
			Void result = fututre.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
