package javapackage;

public class Pattern32 {
    public static void main(String[] args) {
        int size = 4; 
       
        for (int i = size; i >= 1; i--) {
           
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            } 
            System.out.println();
        }

        
        for (int i = 2; i <= size; i++) {
            
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

*******
 *****
  ***
   *
  ***
 *****
*******

*/