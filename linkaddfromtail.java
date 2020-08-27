//Add from the tail.
package linkaddfromtail;

import java.util.*;

public class linkaddfromtail {
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display(){
		Node current = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Add node from End ");
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkaddfromtail nNode = new linkaddfromtail();
		
		nNode.addNode(1);
		nNode.display();
		
		nNode.addNode(2);
		nNode.display();
		
		nNode.addNode(3);
		nNode.display();
		
		nNode.addNode(4);
		nNode.display();
		
		nNode.addNode(5);
		nNode.display();
		
		nNode.addNode(6);
		nNode.display();

	}

}
