package otherPractice;

import java.util.Arrays;

public class AmazonInterview {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,1};
		int k=1;
		
		Arrays.sort(arr);
		//[1,1,3,5,6]
		int count = 1;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				count = 1;
			}
			
		}
	}
}
