package javapackage;

public class Pattern20 {
	
	
	    public static void main(String[] args) {
	        int n = 5;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print(k + 1);
	            }
	            for (int l = i - 1; l >= 0; l--) {
	                System.out.print(l + 1);
	            }
	            System.out.println();
	        }
	    }
	}


/*
    1
   121
  12321
 1234321
123454321
*/
