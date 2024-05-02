package javapackage;

public class Pattern34 {
    public static void main(String[] args) {
        char startChar = 'A';
        int size = 5; 

        
        for (int i = 1; i <= size; i++) {
            
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }

           
            for (int j = 0; j < i; j++) {
                System.out.print((char)(startChar + j));
                if (j < i - 1) {
                    System.out.print(" ");
                }
            }

            
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(" " + (char)(startChar + j));
            }

            System.out.println();
        }
    }
}
/*

        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A

*/
