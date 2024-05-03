package exceptionhandling;

public class ExceptionHandling3 {
	public static void main(String args[]) {
		try {
		int i = 25/5;
		System.out.println(i);

}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("finally block is always executed");
	}
	System.out.println("rest of phe code...");
}
}



/* here the catch not executed, try and then finally*/




   