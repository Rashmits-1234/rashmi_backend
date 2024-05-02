package javapackage;

public class Pattern23 {
    public static void main(String[] args) {
        int size = 5; 

        
        for (int i = 1; i <= size; i++) {
            
            for (int j = 1; j <= size - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

/*

            1  
         1  2  1  
      1  2  3  2  1  
   1  2  3  4  3  2  1  
1  2  3  4  5  4  3  2  1  

*/
