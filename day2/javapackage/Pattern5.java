package javapackage;

public class Pattern5 {
	public static void main(String args[]) {
		int n=5;
		Pattern(n);
	}
	 public static void Pattern(int n) 
	 
	{
		int i,j;
		for(i=1;i<=n;i++) {
			for (j=1;j<=i;j++) {
				System.out.print(" *");			
				}
			System.out.println("");	
		}
	}
	

}

/*
* * * * *  
* * * *  
* * *  
* *  
* 
*/