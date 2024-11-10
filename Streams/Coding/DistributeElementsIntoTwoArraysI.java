package Coding;

import java.util.Stack;

public class DistributeElementsIntoTwoArraysI {

	public static void main(String[] args) {
		int[] arr = {2,1,3};
		Stack<Integer> l1 = new Stack<>();
		Stack<Integer> l2 = new Stack<>();
		int i=2;
		int size = arr.length;
		if(size>2) {
			l1.push(arr[0]);
			l2.push(arr[1]);
		}
		while(i<size) {
			if(l1.peek()>l2.peek()) {
				l1.push(arr[i]);
				i++;
			}
			else {
				l2.push(arr[i]);
				i++;
			}
						
		}
		int[] array = new int[l1.size() + l2.size()];
        int index = 0;

        for (Integer num : l1) {
            array[index++] = num;
        }

        for (Integer num : l2) {
            array[index++] = num;
        
        }
        for(int p : array) System.out.println(p);
	}

}
