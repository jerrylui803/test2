

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		Random rd = new Random();

		for (int i = 1; i < 10; i++) {
			myList.add(rd.nextInt(10) + 1);
		}   

		System.out.println("UnSorted: " + myList);
		msort(myList);
		System.out.println("Sorted: " + msort(myList));
	}

	/**
	 * Merge Sort! Non-decreasing order.
	 * @param unsorted
	 * @return A List that contains all elements from unsorted,
	 *  sorted in non-decreasing order.
	 */
	public static List<Integer> msort(List<Integer> unsorted) {     
		if (unsorted.size() <= 1) {
			return unsorted;
		}

		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for (int i = 0; i < (unsorted.size() / 2); i++) {
			left.add(unsorted.get(i));
		}
		for (int i = unsorted.size() / 2; i < unsorted.size(); i++) {
			right.add(unsorted.get(i));
		}
		
		// The following 2 lines were modified because the results were not assigned appropriately
		left = msort(left);
		right = msort(right);

		return merge(left,right);
	}

	/**
	 * Merge for mergesort.
	 * @param left The left sub-list. Sorted in non-decreasing order.
	 * @param right The right sub-list. Sorted in non-decreasing order.
	 * @return A List that contains all elements from left and right, 
	 * sorted in non-decreasing order.
	 */
	public static List<Integer> merge(List<Integer> left, List<Integer> right) { 

		List<Integer> fin = new ArrayList<Integer>();
		// pointers, Note: fp is useless
		int lp = 0, rp = 0, fp = 0;
		//The following line was modified
		//while (either of the two list is not done)
		while (lp < left.size() || rp < right.size()) { 
			
			//The following line was modified
			// if ((right is out of bound) OR (left is in range and left is smaller than right))
			if ((rp >= right.size()) || (lp < left.size() && left.get(lp) < right.get(rp))) {
				fin.add(left.get(lp));  
				lp++;
			// else ((left is out of bound) OR (right is in range and right is smaller than left))
			} else {
				fin.add(right.get(rp));  
				rp++;        
			}
			fp++;
		}
		return fin;
	}       
}