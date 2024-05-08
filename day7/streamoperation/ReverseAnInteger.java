package streamoperation;
import java.util.stream.IntStream;

public class ReverseAnInteger {
	public static void main (String[]args) {
		int [] a = {2,6,7,89,34};
		int [] b = IntStream.rangeClosed(1, a.length).map(i -> a[a.length - i]).toArray();
		for(int c:b) {
			System.out.print(c+" ");
		}
		
	}

}
