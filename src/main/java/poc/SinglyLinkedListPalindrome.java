package poc;

import java.util.Arrays;
import java.util.List;

class SinglyLinkedListNode {
	Character data;
	SinglyLinkedListNode next;
	
	SinglyLinkedListNode(Character data){
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedListPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> charList = Arrays.asList('m', 'a', 'd', 'a', 'm');
		SinglyLinkedListNode head = null, temp = null;
		for(Character c : charList) {
			if(null == head) {
				head = new SinglyLinkedListNode(c);
				temp = head;
			}else {
				temp.next = new SinglyLinkedListNode(c);
				temp = temp.next;
			}
		}
		temp = head;
		while(temp != null) {
			
			
			
			temp = temp.next;
		}
		

	}

}
