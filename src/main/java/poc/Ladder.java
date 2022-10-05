/**
 * 
 */
package poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shank
 *
 */
class Node {
	List<Long> steps;
	long val;
	
	Node(long val, List<Long> steps) {
		this.val = val;
		if(null == steps || steps.isEmpty()) {
			this.steps = new ArrayList<>();
		}else {
			this.steps = new ArrayList<>(steps);
		}
	}
}

public class Ladder {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String> result = new ArrayList<>();
		long ladderSize = 15L;
		List<Long> possibleSteps = Arrays.asList(1L, 2L, 3L);
		Node root = new Node(ladderSize, null);
		steps(root, possibleSteps, ladderSize, result);
		result.stream().forEach(System.out::println);
	}
	
	private static boolean steps(Node node, List<Long> possibleSteps, long ladderSize, List<String> result) {
		if(ladderSize == node.steps.stream().collect(Collectors.summingLong(e -> e))) {
			System.gc();
			result.add(node.steps.stream().map(e -> Long.toString(e)).collect(Collectors.joining()));
		}
		boolean isValidPath = false;
		Node child = null;
		if(node.val > 0) {
			for(long step : possibleSteps) {
				child = new Node(node.val - step, node.steps);
				child.steps.add(step);
				isValidPath = steps(child, possibleSteps, ladderSize, result);
			}
		}
		return node.val == 0 || isValidPath;
	}

}
