package javapackage;

public class Pattern36 {
    public static void main(String[] args) {
        int size = 5; 

       
        for (int i = 0; i < size; i++) {
           
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("   ");
            }
            
            for (int j = i; j >= 0; j--) {
                System.out.print((char)('A' + j) + "  ");
            }
           
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j) + "  ");
            }
            System.out.println();
        }
    }
}
/*

            A  
         B  A  B  
      C  B  A  B  C  
   D  C  B  A  B  C  D  
E  D  C  B  A  B  C  D  E  

*/


