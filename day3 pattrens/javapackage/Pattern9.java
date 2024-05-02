package javapackage;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
      
    }
}
 
//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 
