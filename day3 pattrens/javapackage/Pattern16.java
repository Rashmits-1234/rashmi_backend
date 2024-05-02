package javapackage;

public class Pattern16 {
    public static void main(String[] args) {
        int size = 5; 

        
        for (int i = 0; i < size; i++) {
          
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }
           
            int num = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }
}

/*

        1 
      0 1 0 
    1 0 1 0 1 
  0 1 0 1 0 1 0 
1 0 1 0 1 0 1 0 1 

*/
