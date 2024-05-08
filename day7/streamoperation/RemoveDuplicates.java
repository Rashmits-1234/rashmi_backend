package streamoperation;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(1);
		set.add(2);
		List<Integer> c = set.stream().distinct().collect(Collectors.toList());
		System.out.println(c);
		
		}

}

