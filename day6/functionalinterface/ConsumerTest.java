package functionalinterface;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main (String[] args) {
		Consumer <String> C = S -> System.out.println(S);
		C.accept("Rashmi");
		C.accept("Aishwarya");
	}

}
