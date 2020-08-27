//Sum of numbers in a given range
package sumofrange;

import java.util.Scanner;

class sumofrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n1,n2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		n1 = sc.nextInt();
		System.out.println("enter a second number");
		n2 = sc.nextInt();
		sum=0;
		for(i=n1;i<=n2;i++){
			sum=sum+i;
		}
		System.out.println("Sum= "+sum);
	}

}
