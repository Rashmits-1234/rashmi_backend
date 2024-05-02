package javapackage;

public class Pattern17 {
    public static void main(String[] args) {
        int size = 5; 

        
        for (int i = size; i >= 1; i--) {
           
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

*********
 *******
  *****
   ***
    *

*/
