package javapackage;

public class Pattern39 {
    public static void main(String[] args) {
        int size = 4; 

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print(j);
            }
            for (int j = size - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print(j);
            }
            for (int j = size - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*

1234321
 23432
  343
   4
  343
 23432
1234321

*/
