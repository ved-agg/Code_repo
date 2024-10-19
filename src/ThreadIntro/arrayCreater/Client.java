package ThreadIntro.arrayCreater;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		ExecutorService executorService = Executors.newCachedThreadPool();
		ArrayCreator ar = new ArrayCreator(n, executorService);
		Future<List<Integer>> future = executorService.submit(ar);
		System.out.println(future.get());
				

	}

}
