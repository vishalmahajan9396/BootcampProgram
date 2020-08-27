//Octal to Decimal conversion
package octaltodecimal;

import java.util.Scanner;

class octaltodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,a,b,base;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a octal number");
		n = sc.nextInt();
		a=0;b=0;base=1;
		while(n>0){
			a=n%10;
			b=b+a*base;
			base=base*8;
			n=n/10;
		}
		System.out.println(b);
	}
}
