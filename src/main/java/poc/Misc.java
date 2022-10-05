package poc;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "My name is Shankar Shankarsan is my name";
		Map<String, Long> resultMap = Arrays
				.stream(name.split(" "))
				.map(e -> e.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(resultMap);
	}

}
