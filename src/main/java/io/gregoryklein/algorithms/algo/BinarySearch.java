package io.gregoryklein.algorithms.algo;

/**
 * @author Gregory.KLEIN
 *
 */
public class BinarySearch {
	
	public static int search(int[] array, int item) {
		int left = 0;
		int right = array.length - 1;
		int center;
		
		while(left <= right) {
			center = (int) Math.floor((left + right) / 2);
			
			if(array[center] == item) return center;
			
			if(array[center] > item) {
				right = center - 1;
			} else if (array[left] < item) {
				left = center + 1;
			}
		}
		
		return -1;
	}

}
