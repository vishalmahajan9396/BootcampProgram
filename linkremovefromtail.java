//Remove from tail.
package linkremovefromtail;

import java.util.*;

public class linkremovefromtail {
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
	public void removeTail(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			if(head != tail){
				Node current = head;
				while(current.next != tail){
					current = current.next;
				}
				tail = current;
				tail.next= null;
			}
			else{
				head = tail = null;
			}
		}
	}
	public void display(){
		Node current = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkremovefromtail nNode = new linkremovefromtail();
		
		nNode.addNode(1);
		nNode.addNode(2);
		nNode.addNode(3);
		nNode.addNode(4);
		nNode.addNode(5);
		
		System.out.println("original list");
		nNode.display();
		
		while(nNode.head != null){
			nNode.removeTail();
			System.out.println("updated list");
			nNode.display();
			}
		}

}
