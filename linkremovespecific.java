//Remove at specific position
package linkremovespecific;

import java.util.Scanner;

public class linkremovespecific {
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
	public void removePosition(){
		Node temp,current;
		if(head == null){
			System.out.println("list is empty");
			return;
		}
		else{
			
			int n,i,count;
			System.out.println("enter a position of node to be remove ");
			n= sc.nextInt();
			count = n;
			if(head!= tail){
				temp = head;
				current = null;
				for(i=0;i<count;i++){
					current = temp;
					temp = temp.next;
				}
				if(current!=null){
					current.next = temp.next;
					temp=null;
				}
				else{
					head=tail=temp.next;
					temp= null;
				}
			}
			else{
				head=tail=null;
			}
		}
		size--;
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
		linkremovespecific nNode = new linkremovespecific();
		
		nNode.addNode(1);
		nNode.addNode(2);
		nNode.addNode(3);
		nNode.addNode(4);
		
		System.out.println("original list");
		nNode.display();
		
		while(nNode.head != null){
			nNode.removePosition();
			System.out.println("Updated list ");
			nNode.display();
		}
	}
}
