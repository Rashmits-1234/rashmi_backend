package javapackage;

public class Pattern35 {
    public static void main(String[] args) {
        int size = 5; 

        
        for (int i = 1; i <= size; i++) {
            
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*

        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 


*/
