package javapackage;

import java.util.Scanner;

public class array {
	
		public static void main(String[] args) {
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter the size:");
			
			int size = scanner.nextInt();
			
			int[] arr = new int[size];
			
			System.out.println("Enter the Elements:");
			for(int i = 0; i<arr.length; i++) {
				arr[i] = scanner.nextInt();
				
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
}
