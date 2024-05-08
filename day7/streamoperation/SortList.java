package streamoperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("AFDGEDJJA", "BBC", "AAFF", "CCJGGJG");
		 names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
	

}
