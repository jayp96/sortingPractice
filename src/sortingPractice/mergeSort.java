package sortingPractice;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Will be using the concept of merging of two sorted arrays and call it recursively
		int[] arr = {400,12,34,64,23,44,77,12,86,-10,23};
		
		arr = mergeSort(arr, 0, arr.length-1);
		
		for(int itr = 0; itr < arr.length; itr++) {
			if(itr == arr.length-1) {
				System.out.print(arr[itr]);
			}
			else {
			System.out.print(arr[itr] + ",");
			}
		}
	}
	
	public static int[] mergeSort(int[] arr, int low, int high) {
	
		//Create base case
		if(low ==high) {
			int[] ba = new int[1];
			ba[0] = arr[low];
			return ba;
		}
		
		int mid = (low + high) / 2;
		
		int[] firstSortedHalf =  mergeSort(arr, low, mid);
		int[] secondSortedHalf = mergeSort(arr, mid+1, high);
		
		int[] fullSortedArray = mergeTwoSortedArrays(firstSortedHalf,secondSortedHalf);
		
		//Arrays.sort(fullSortedArray);
		
		return fullSortedArray;
	}
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b ) {
		
		int i=0, j=0, k=0;
		
		int[] res = new int[a.length+ b.length];
		
		while(i< a.length && j < b.length) {
			if(a[i]<b[j]) {
				res[k] = a[i];
				k++;
				i++;
			}
			else {
				res[k] = b[j];
				k++;
				j++;
			}
		}
		
		while(i< a.length) {
			res[k] = a[i];
			k++;
			i++;
		}
		
		while( j< b.length) {
			res[k] = b[j];
			k++;
			j++;
		}
		
		return res;
		
	}

}