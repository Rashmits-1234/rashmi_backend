package javapackage;

public class Pattern26 {
    public static void main(String[] args) {
        int size = 5; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
                if (j < i + 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

/*


        1 
      1 * 2 
    1 * 2 * 3 
  1 * 2 * 3 * 4 
1 * 2 * 3 * 4 * 5 



*/
