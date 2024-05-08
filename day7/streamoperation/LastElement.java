package streamoperation;

import java.util.Arrays;

public class LastElement {
	public static void main(String[]args) {
		Integer[] array = {1,2,3,4,5};
		Integer lastElement = Arrays.stream(array).reduce((first, second) -> second).orElse(null);
		System.out.println("Last element:" + lastElement);
		
	}

}





