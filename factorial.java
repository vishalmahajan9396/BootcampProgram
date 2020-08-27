//Factorial of a number
package factorial;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		mul=1;
		if(n>0){
		for(i=n;i>=1;i--){
			mul=mul*i;
		}
		System.out.println("factorial of number is= "+mul);
		}
		else if(n==0){
			System.out.println("factorial of number is 1");
		}
	}
}
