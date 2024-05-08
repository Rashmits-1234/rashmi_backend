package streamoperation;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEach {
public static void main(String[] args) {

		String input =" Frequency of each character";
		
		 Map<Character, Long> character = input.chars().mapToObj(c->(char) c)
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 
		 System.out.println(character);
	}

}



