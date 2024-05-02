package javapackage;

public class Pattern15 {
    public static void main(String[] args) {
        int size = 5;

        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (i % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
/*

        1 
      0 0 0 
    1 1 1 1 1 
  0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 

*/
