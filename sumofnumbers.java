//Sum of N natural numbers:
package sumofnumbers;

import java.util.Scanner;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n =  sc.nextInt();
		sum = 0;
		for(i=0;i<=n;i++){
			sum=sum+i*(i+1)/2;
		}
		System.out.println("Sum="+sum);

	}

}
