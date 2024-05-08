package streamoperation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsorted {
	public static void main(String[] args) {
		int[] a= {77,96,45,33,6,7};
		int[] b = {6,7,8,9,10};
	
		int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
				.sorted().distinct().toArray();
		//System.out.println(c);
		
		for(int num : c) {
			System.out.print(num + " ");
		}
		
	}

}
