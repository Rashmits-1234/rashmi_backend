package streamoperation;
import java.util.Arrays;
import java.util.stream.IntStream;
public class MergeTwoSorted {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
	
		int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
				.sorted().toArray();
		//System.out.println(c);
		
		for(int num : c) {
			System.out.print(num + " ");
		}
	}

}
