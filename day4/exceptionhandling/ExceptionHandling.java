package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
		int data=50/0; 
		}
             
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
	
}


/*

java.lang.ArithmeticException: / by zero
rest of the code

*/