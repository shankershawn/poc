package poc;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "ravi kumar says hello.";
		String[] splitted = name.split(" ");
		String formattedName = Arrays.stream(splitted).map((e) -> {
			char a[] = e.toCharArray();
			a[0] = Character.toUpperCase(a[0]);
			return new String(a);
		}).collect(Collectors.joining(" "));
		System.out.println(formattedName);
	}
}


