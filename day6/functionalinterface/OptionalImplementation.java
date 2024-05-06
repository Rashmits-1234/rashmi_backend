package functionalinterface;

import java.util.Optional;

public class OptionalImplementation {
	public static void main(String[] args) {
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		System.out.println(emptyOptional.get());
		if(emptyOptional.isPresent())
			System.out.println(emptyOptional.get());
		
		//Optional<String> name2 = Optional.ofNullable(emp.getName());
		//System.out.println(name2);
		
		System.out.println(name2.orElse("No name found"));
		
		System.out.println(name2.orElseThrow(() -> new IllegalArgumentException("no name")));
		
		System.out.println(name2.map(String :: toUpperCase).orElseGet(() -> "No Name"));
	}

}
