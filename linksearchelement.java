//Search the element.
package linksearchelement;

import java.util.*;

public class linksearchelement {
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
	
	public void searchNode(int data){
		Node current = head;
		int i=1;
		boolean flag = false;
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			while(current != null){
				if(current.data== data){
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if(flag){
			System.out.println("element is present at the position "+i);
		}
		else{
			System.out.println("element is not present ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linksearchelement nNode = new linksearchelement();
		nNode.addNode(1);
		nNode.addNode(2);
		nNode.addNode(3);
		nNode.addNode(4);
		nNode.addNode(5);
		
		nNode.searchNode(3);
		nNode.searchNode(6);
	
	}

}
