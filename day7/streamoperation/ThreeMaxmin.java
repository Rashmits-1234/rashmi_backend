package streamoperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxmin {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().sorted().limit(3).forEach(System.out::println);
		
		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
