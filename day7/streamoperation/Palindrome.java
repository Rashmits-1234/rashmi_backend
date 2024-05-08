package streamoperation;

import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String[] args) {
		String Str ="malayalam";
		boolean input = IntStream.range(0, Str.length()/2).noneMatch(i -> Str.charAt(i)!= Str.charAt(Str.length()-i-1));
		System.out.print(input);
	}

}
