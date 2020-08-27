//Greatest of two numbers
package greatestnumber;

import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		n1 = sc.nextInt();
		System.out.println("enter second number: ");
		n2 = sc.nextInt();
		if(n1>n2){
			System.out.println(n1+" is a greatest number");
		}
		else{
			System.out.println(n2+" is a greatest number");
		}
	}

}
