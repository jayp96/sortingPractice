package sortingPractice;

public class bubbleSort {
	
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
//We place the biggest element first here
	
//We try comparing the 1st element with 0th element and so on and swap it.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,4,2,6,5};
		
		for(int itr = 1; itr <= arr.length-1; itr++) {
			for(int j = 0; j < arr.length-itr; j++) {
				if(isSmaller(arr,j+1,j)) {
					swap(arr, j+1 , j);					
				}
			}
		}
		
		for(int itr = 0; itr < arr.length; itr++) {
		System.out.print(arr[itr]);
		}
	}

}
