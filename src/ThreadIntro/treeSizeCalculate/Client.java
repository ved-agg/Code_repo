package ThreadIntro.treeSizeCalculate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		//ExecutorService executorService = Executors.newFixedThreadPool(3);
		ExecutorService executorService = Executors.newCachedThreadPool();
		TreeSizeCalculator sizeCalculator = new TreeSizeCalculator(root, executorService);
		Future<Integer> future = executorService.submit(sizeCalculator);
		System.out.println(future.get());
		executorService.shutdown();
	}

}
