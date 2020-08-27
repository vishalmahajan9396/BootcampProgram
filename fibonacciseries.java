//Fibonacci Series upto nth term
package fibonacciseries;

import java.util.Scanner;

class fibonacciseries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		y=0;
		z=1;
		for(i=1;i<=n;i++){
			x=y;
			y=z;
			z=x+y;
			System.out.println(z);
		}
	}
}
