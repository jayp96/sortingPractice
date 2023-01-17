package sortingPractice;

public class insertionSort {


	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static boolean isGreater(int arr[], int i, int j) {
		if(arr[i]>arr[j]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,7,1,-1,56,2,-8};
		//Taking the first ele as already sorted
			
		for(int i=1; i<arr.length; i++) {
			for(int j= i-1;j >= 0; j--) {
				if(isGreater(arr,j,j+1)) { // If I am greater than the next element, swap with me
					swap(arr,j,j+1);
				}
				else {
					break;
				}
			}
		}
		
		for(int itr = 0; itr < arr.length; itr++) {
			if(itr == arr.length-1) {
				System.out.print(arr[itr]);
			}
			else {
			System.out.print(arr[itr] + ",");
			}
		}
	}

}
