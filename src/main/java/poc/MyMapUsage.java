package poc;

import java.util.Arrays;
import java.util.Random;

public class MyMapUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		MyMap<Integer, Long> myMap = new MyMap<>(10);
		for(int i = 0; i < 10000; i++) {
			myMap.put(i, r.nextLong());
		}
		Arrays.stream(myMap.buckets).filter(p -> p != null).forEach((p) -> {
			Pair p1 = p;
			System.out.println(p1.key);
			while(p1.next != null) {
				p1 = p1.next;
				System.out.print(p1.key + " ");
			}
		});

	}

}
