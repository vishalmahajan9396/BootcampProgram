//Binary to Decimal to conversion
package binarytodecimal;

import java.util.Scanner;

class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,base,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a binary number");
		n = sc.nextInt();
		b=0;
		a=0;
		base=1;
		while(n>0){
			a=n%10;
			n=n/10;
			b=b+a*base;
			base=base*2;	
		}
		System.out.print(b);
		}
	}