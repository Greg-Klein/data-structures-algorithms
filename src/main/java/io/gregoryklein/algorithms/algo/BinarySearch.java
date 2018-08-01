package io.gregoryklein.algorithms.algo;

public class BinarySearch {
	
	public int search(int[] array, int item) {
		int start = 0;
		int end = array.length - 1;
		int center;
		
		if(array.length == 0) return -1;
		
		while(start <= end) {
			
			center = (int) Math.floor((start + end) / 2);
			
			if(array[center] == item) return center;
			
			if(array[center] >= item) {
				end = center - 1;
			} else if (array[center] <= item) {
				start = center + 1;
			}
		}
		
		return -1;
	}

}
