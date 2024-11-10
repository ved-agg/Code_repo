package Coding;

import java.util.ArrayList;
import java.util.List;

public class DistributeElementsIntoTwoArraysII {

	
	public static int greaterCount(List<Integer> arr, int num) {
		int n=0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>num) n++;
		}
		return n;
		
	}
	public static void main(String[] args) {
		int[] arr = {5,14,3,1,2};
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		int i=2;
		int size = arr.length;
		if(size>2) {
			l1.add(arr[0]);
			l2.add(arr[1]);
		}
		while(i<size) {
			if(greaterCount(l1, arr[i])>greaterCount(l2, arr[i])) {
				l1.add(arr[i]);
				i++;
			}
			else if(greaterCount(l1, arr[i]) < greaterCount(l2, arr[i])){
				l2.add(arr[i]);
				i++;
			}
			else {
				if(l1.size()<=l2.size()) l1.add(arr[i]);
				else l2.add(arr[i]);
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
