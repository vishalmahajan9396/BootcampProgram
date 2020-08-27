//Remove from Head.
package llinkremovefromhead;

import java.util.*;

public class linkremovefromhead {
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
	public void removeHead(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			if(head != tail){
				head = head.next;
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
		linkremovefromhead nNode = new linkremovefromhead();
		
		nNode.addNode(1);
		nNode.addNode(2);
		nNode.addNode(3);
		nNode.addNode(4);
		nNode.addNode(5);
		
		System.out.println("original list");
		nNode.display();
		
		while(nNode.head != null){
			nNode.removeHead();
			System.out.println("updated list");
			nNode.display();
			}
		}


}
