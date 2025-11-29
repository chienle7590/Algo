package be9;

import java.util.Arrays;


public class SortedSwap {
	public static boolean Solution(int[] arr) {
		
		int[] clonedArray = arr.clone();
		Arrays.sort(clonedArray);
		
		int i = 0;
		int countDiff = 0;
		
		while (i < arr.length){
			
			if (arr[i] != clonedArray[i]) {
				countDiff++;
				
			}
			
			i++;	
		}
		
		
		return (countDiff == 2 || countDiff == 0);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,3,4};
		System.out.println(Solution(arr));

		
	}
	
}
