package sortingPractice;

import java.util.Iterator;

public class quickSort {
 
	
	public static int partition(int[] arr, int pivot, int lo, int hi) {
		
		System.out.println("Pivot is " + pivot);
		int i= lo, j = lo; 
		System.out.println(" i " + i + " j " + j);
		while(i <= hi) {
			if(arr[i] <= pivot) {
				if(i==j) {i++; j++;}
				else {
				swap(arr,i,j);
				i++;
				j++;
				}
			}
			else {
				i++;
			}
			
			System.out.println(" i " + i + " j " + j);
		}
		
		System.out.println("Pivot index " + (j-1));
		return (j-1);
	}
	
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping the arr " + arr[i] + " & " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println("Swapped the arr " + arr[i] + " & " + arr[j]);
		
	}
	
	public static void quickSorta(int[] arr, int lo, int hi) {
		
		if(lo >= hi) {
			return;
		}
		
		int pivot = arr[hi];
		int pivotIndex = partition(arr, pivot, lo, hi);
		
		System.out.println("PIVOT INDEX" + pivotIndex);
		quickSorta(arr, lo, pivotIndex-1); 
		quickSorta(arr, pivotIndex+1, hi);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,2,5,76,8,2,1,5,7,65};
		
		quickSorta(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
 }
}
