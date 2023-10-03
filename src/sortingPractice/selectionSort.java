package sortingPractice;

public class selectionSort {
	
	/*
	 * we take the first element as minimum
	 */
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static boolean isSmaller(int arr[], int i, int j) {
		if(arr[i]<arr[j]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,8,5,6,1,3,5};
		
		for(int i=0; i< arr.length; i++) {
			int min = i;
			for(int j=i+1; j<arr.length;j++) {
				if(isSmaller(arr,j,min)) {
					min =j;
				}
			}
			swap(arr,i,min);
		}
		
		for(int itr = 0; itr < arr.length; itr++) {
			System.out.print(arr[itr]);
		}
	}

}
