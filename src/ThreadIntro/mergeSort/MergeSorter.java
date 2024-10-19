package ThreadIntro.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>>{

	List<Integer> arrayToSort;
	ExecutorService service;
	public MergeSorter(List<Integer> arrayToSort, ExecutorService service) {
		this.arrayToSort = arrayToSort;
		this.service = service;
	}

	@Override
	public List<Integer> call() throws InterruptedException, ExecutionException {
		if(arrayToSort.size()<=1)
			return arrayToSort;
		
		int mid = arrayToSort.size()/2;
		
		List<Integer> leftArray = new ArrayList<Integer>();
		List<Integer> rightArray = new ArrayList<Integer>();
		
		for(int i=0;i<mid;i++) leftArray.add(arrayToSort.get(i));
		for(int i=mid;i<arrayToSort.size();i++) rightArray.add(arrayToSort.get(i));
		
		//ExecutorService service = Executors.newCachedThreadPool();
		
		MergeSorter leftsorter = new MergeSorter(leftArray, service);
		MergeSorter rightsorter = new MergeSorter(rightArray, service);
		
		Future<List<Integer>> leftSortedFuture = service.submit(leftsorter);
		Future<List<Integer>> rightSortedFuture = service.submit(rightsorter);
		
		List<Integer> leftsort = leftSortedFuture.get();
		List<Integer> rightsort = rightSortedFuture.get();
		
		List<Integer> list = new ArrayList<Integer>();
		int i=0,j=0;
		
		while(i<leftsort.size() && j<rightsort.size()) {
			if(leftsort.get(i)<rightsort.get(j)) {
				list.add(leftsort.get(i));
				i++;
			}
			else {
				list.add(rightsort.get(j));
				j++;
			}
		}
		
		while(i<leftsort.size()) {
			list.add(leftsort.get(i));
			i++;
		}
		 while(j<rightsort.size()) {
			 list.add(rightsort.get(j));
			 j++;
		 }		
		return list;
	}
}
