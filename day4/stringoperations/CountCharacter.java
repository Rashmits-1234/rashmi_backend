package stringoperations;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		
			int i;
			int count=0;
				String s;

				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter a String");
				 s=sc.nextLine(); 
				 
				 for(i=0;i<s.length();i++)
					 
				 {
					 if(s.charAt(i)!=' ')
						 count++;
				 }
				 System.out.println("number of character is:"+count);
					

	}

}
