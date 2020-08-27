//Greatest of the Three numbers
package greatestofthree;

import java.util.Scanner;

class greatestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		n1 = sc.nextInt();
		
		System.out.println("enter second number");
		n2 = sc.nextInt();
		
		System.out.println("enter third number");
		n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3){
			System.out.println(n1+" is greater");
		}
		else if(n2>n1 && n2>n3){
			System.out.println(n2+" is greater");
		}
		else{
			System.out.println(n3+" is greater");
		}

	}

}
