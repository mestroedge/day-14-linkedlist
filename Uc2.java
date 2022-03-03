package linked;

public class Uc2 {
	Node thirdNode = new Node(70);
	linkedList.head.next = secondNode;
	secondNode.next = thirdNode;
	printList();
}
/*
 * Print the linked list
 */
public static void printList() {
	Node currNode = head;
	System.out.print("Linked List " );

	/*
	 * if CurrNode not null then print current Node
	 */
	while(currNode != null) {
		System.out.print(currNode.key + " ");
		currNode= currNode.next;

	}
	/*
	 * Printing Linked List
	 */
	System.out.println(currNode);
}

}
