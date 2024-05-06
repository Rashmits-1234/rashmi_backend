package functionalinterface;

import java.util.function.Function;

public class RapplyFI {
	public static void main(String[] args) {
		Function<Integer, Double> half = a -> a / 2.0;
	 	 System.out.println(half.apply(10));
	 
	 	 // using and then
	Function<Integer, Double> half1 = a -> a / 2.0;
	half1 = half1.andThen(a -> 3 * a);
	System.out.println(half1.apply(10));
	}
}

