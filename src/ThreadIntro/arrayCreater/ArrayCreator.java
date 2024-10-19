package ThreadIntro.arrayCreater;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ArrayCreator implements Callable<List<Integer>>{
	int n;
	ExecutorService executorService;
	public ArrayCreator(int n, ExecutorService executorService) {
		this.n = n;
		this.executorService = executorService;
	}
	@Override
	public List<Integer> call() throws Exception {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(i+1);
		}
		return list;
	}
	
		
	
}
