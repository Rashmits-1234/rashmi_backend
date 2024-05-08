package streamoperation;

import java.util.Arrays;
import java.util.List;

public class OddOrEven {
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	int evenSum = numbers.stream().filter(num -> num % 2 ==0).mapToInt(Integer::intValue).sum();
	System.out.println("sum of even numbers:" +  evenSum);

	
	List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	int OddSum = numbers1.stream().filter(num -> num % 2 !=0).mapToInt(Integer::intValue).sum();
	System.out.println("sum of even numbers:" +  OddSum);

}
}



















