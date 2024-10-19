package ThreadIntro.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Integer> list = List.of(7,3,6,5,2,8,9,5,34,23,65,321);
		ExecutorService executor = Executors.newCachedThreadPool();
		MergeSorter merge = new MergeSorter(list, executor);
		Future<List<Integer>> futureSortedArray = executor.submit(merge);
		List<Integer> sortedArray = futureSortedArray.get();
		System.out.println(sortedArray);
	}

}
