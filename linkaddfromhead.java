//Add from the head
package linkaddfromhead;

import java.util.*;

public class linkaddfromhead {
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
				Node temp = head;
				head = newNode;
				head.next = temp; 
			}
		}
		public void display(){
			Node current = head;
			if(head == null){
				System.out.println("List is empty");
				return;
			}
			System.out.println("Add node from start ");
			while(current != null){
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkaddfromhead nNode = new linkaddfromhead();
		
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
