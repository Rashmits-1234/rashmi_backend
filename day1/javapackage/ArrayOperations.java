package javapackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	
		private static final int[] array = null;
		public static void main(String[] args) {
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter the size:");
			
			int size = scanner.nextInt();
			
			int[] array = createArray(size);
			
			System.out.println("Enter the Elements:");
			for(int i = 0; i<size; i++) {
				array[i] = scanner.nextInt();
				
			}
			System.out.println("original Array:");
			printArray(array);
			
			int [] reversedArray = reverseArray(array);
			System.out.println("Reversed Array:");
			printArray(reversedArray);
			
			int [] sortedArray = sortArray(array);
			System.out.println("Sorted Array:");
			printArray(sortedArray);
			
			int minElement = findMinElement(array);
			System.out.println("Minimum Element:"+minElement);
			
			
			
			
			
		}
			public static int[] createArray(int size) {
				return new int[size];
			}
            public static void  printArray(int [] arr) {
                for (int num : arr) {
                	System.out.println(num+" ");
                }
            System.out.println();
	}
            public static int []
            		reverseArray(int [] arr) {
            int [] reversedArray = new int [arr.length];
            for (int i=0; i<arr.length; i++) {
            	reversedArray[i] = arr[arr.length-1-i];
            }
            return reversedArray;
            }


    public static int [] sortArray(int[] arr) {
	int [] sortedArray = Arrays.copyOf(arr, arr.length);
	Arrays.sort(sortedArray);
	return sortedArray;
	
}

}




		

