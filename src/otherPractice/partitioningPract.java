package otherPractice;

import java.util.stream.Stream;

public class partitioningPract {

	/*
	 * Divide the array in 3 regions
	 * Unknown, greater than, smaller than equal to
	 * i to end -> unknown
	 * 
	 * j to i-1 -> Greater than pivot
	 * 
	 * 0 to j-1 -> (<= Pivot)
	 * 
	 * a[i] > p -> i++
	 * a[i] <= p -> swap(a,i,j) ; i++; j++
	 */
	
	public static void main(String[] args) {
		
		//int arr[] = {9,12,5,10,14,3,10};
		int arr[] = {14,12,11,10,9,8,10};
		int pivot = 10;
		
		partition(arr,pivot);
		
		for(int itr = 0; itr < arr.length; itr++) {
			if(itr == arr.length-1) {
				System.out.print(arr[itr]);
			}
			else {
			System.out.print(arr[itr] + ",");
			}
		}
		
		//Stream.of("Abhi","Don","Aja","Aba","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	}
	
	public static void partition(int[] arr, int pivot) {
		int i=0;
		int j=0;
		
		while(i<arr.length) {
			if(arr[i] > pivot) {
				i++;
			}
			/*
			else if(arr[i] == pivot){
				//swap(arr,i,j);
				i++;
				j++;
				
			}*/
			else {
				swap(arr,i,j);
				i++;
				j++;
				
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
