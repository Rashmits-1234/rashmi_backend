package streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffix {
	public static void main(String[]args) {
		List<String> names = Arrays.asList("apple","app","mouse","rashmi","rash");
       String String = names.stream().collect(Collectors.joining(", ","Prefix "," Suffix"));
       System.out.println(String);
		
	}

}
