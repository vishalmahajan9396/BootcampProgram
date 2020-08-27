//Add at specific position
package linkaddspecific;

import java.util.*;

public class linkaddspecific {
	Scanner sc = new Scanner(System.in);
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public int size;
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
		size++;
	}
	public void addPosition(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			Node temp,current;
			int n,i,count;
			System.out.println("enter a position of node ");
			n= sc.nextInt();
			count = n;
			temp = head;
			current = null;
			for(i=0;i<count;i++){
				current = temp;
				temp = temp.next;
			}
			current.next = newNode;
			newNode.next = temp;
		}
		size++;
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
		Scanner sc = new Scanner(System.in);
		linkaddspecific nNode = new linkaddspecific();
		
		nNode.addNode(1);
		nNode.addNode(2);
		nNode.addNode(3);
		nNode.addNode(4);
		
		System.out.println("original list");
		nNode.display();
		
		nNode.addPosition(5);
		System.out.println("Updated list ");
		nNode.display();
		
		nNode.addPosition(6);
		System.out.println("Updated list ");
		nNode.display();

	}

}
