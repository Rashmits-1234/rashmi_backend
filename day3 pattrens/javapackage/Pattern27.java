package javapackage;

public class Pattern27 {
    public static void main(String[] args) {
        int size = 5; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = size - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= size - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*

5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
    
*/        
        
