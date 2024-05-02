package javapackage;

public class Pattern24 {
    public static void main(String[] args) {
        int size = 5;

        
        for (int i = 1; i <= size; i++) {
           
            for (int j = 1; j <= size - i; j++) {
                System.out.print("   ");
            }
          
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

/*

            1  
         1  2  3  
      1  2  3  4  5  
   1  2  3  4  5  6  7  
1  2  3  4  5  6  7  8  9  

*/
