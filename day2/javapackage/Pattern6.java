package javapackage;

public class Pattern6 {
	public static void main(String args[]) {
		int n=5;
		Pattern(n);
	}
	 public static void Pattern(int n) 
	 
	{
		int i,j;
		for(i=n;i>=1;i--) {
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