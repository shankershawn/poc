package poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class BinaryTreePrintLevels {
	
	
	
	public static void main(String[] args) {
		Map<Integer, List<Integer>> levelWiseTreeData = new HashMap<>();
		Node1 root = null;
		printBinary(root, levelWiseTreeData, 0);
		
		for(Entry<Integer, List<Integer>> entry : levelWiseTreeData.entrySet()) {
			//print
		}
	}
	
	
	private static void printBinary(Node1 node, Map<Integer, List<Integer>> levelWiseTreeData, int level) {
		if(levelWiseTreeData.containsKey(level)) {
			levelWiseTreeData.getOrDefault(level, new ArrayList<>()).add(node.data);
		}else {
			List<Integer> temp = new ArrayList<>();
			temp.add(node.data);
			levelWiseTreeData.put(level, levelWiseTreeData.getOrDefault(level, temp));
		}
		if(null != node.left) {
			printBinary(node.left, levelWiseTreeData, level++);
		}
		if(null != node.right) {
			printBinary(node.right, levelWiseTreeData, level++);
		}
		return;
	}

}
