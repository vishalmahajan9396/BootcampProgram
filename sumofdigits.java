//Sum of digits of a number
package sumofdigits;

import java.util.Scanner;

class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		sum=0;
		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum of digits= "+sum);

	}

}
