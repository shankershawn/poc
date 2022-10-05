package poc;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumNumber {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {-9, 6, 0, 10, 10, 0, 0 ,0};
		
		//System.out.println(Arrays.stream(arr).boxed().max(Comparator.naturalOrder()));
		
		System.out.println(Arrays.asList(-9, 6, 0, 10, 10, 0, 0 ,0).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))); 
	}

}
