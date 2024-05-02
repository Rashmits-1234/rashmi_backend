package javapackage;

public class Pattern33 {
    public static void main(String[] args) {
        int size = 4; 

        
        for (int i = 1; i <= size; i++) {
            
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
        for (int i = size - 1; i >= 1; i--) {
            
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*

      1 
    2 1 2 
  3 2 1 2 3 
4 3 2 1 2 3 4 
  3 2 1 2 3 
    2 1 2 
      1 

*/
