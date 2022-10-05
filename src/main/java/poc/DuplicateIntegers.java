package poc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(1,2,2,3,4,5,6,1,7,8,6,8,8,7,0,0,0);
		
		//List of duplicate integers
		//Swagger, Java Stream 8
		System.out.println(myList
				.stream()
				.collect(Collectors
						.groupingBy(e -> e, Collectors
								.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(e -> String
						.valueOf(e.getKey()))
				.collect(Collectors
						.joining(",")));
	}

}
