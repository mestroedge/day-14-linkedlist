package linked;

public class Linkedlist {


	private static Node head;


	/**
	* Main method for manipulation linkedList
	* @param args - Default Java param (Not used)
	*/

	public static void main(String[] args) {

		/*
		 * PROCEDURE
		 * 1.Creating Simple Linked List 56 , 30 , 70
		 */

		/*
		 * Creating Linked List
		 */
		LinkedList linkedList = new LinkedList();

		/*
		 * Adding Nodes to LinkedList
		 */
		linkedList.head = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);
		linkedList.head.next = secondNode;
		secondNode.next = thirdNode;
	}
	}

