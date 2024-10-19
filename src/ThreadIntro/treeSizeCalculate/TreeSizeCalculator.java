package ThreadIntro.treeSizeCalculate;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
	public Node root;
	public ExecutorService executorService;
	public TreeSizeCalculator(Node root, ExecutorService executorService) {
		this.root = root;
		this.executorService = executorService;
	}
	@Override
	public Integer call() throws Exception {
		if(root == null) return 0;
		
		TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left, executorService);
		TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right, executorService);
		
		Future<Integer> leftSize = executorService.submit(leftTree);
		Future<Integer> rightSize = executorService.submit(rightTree);
		
		return leftSize.get() +1+rightSize.get();
	}	
}
