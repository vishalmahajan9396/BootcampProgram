/*Friendly pair :
	Example :
	Suppose two numbers 220 and 284.
	Factors of both numbers :
	– Factors of 220 = 1 , 2 , 4 , 5 , 10 , 11 , 20 , 22 , 44 , 55 and 110 ;
	– Factors of 284 = 1 , 2 , 4 , 71 and 142.
	Sum of factors of both numbers :
	– Sum of factors of 220 =
	1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
	– Sum of factors of 284 =
	1 + 2 + 4 + 71 + 142 = 220
	Here we see that Sum of factors of first number is equal to the second number and Sum of factors of the second number is equal to the first number. Hence, these both numbers are Friendly Pair to each other.*/
package friendlypair;

import java.util.Scanner;

class friendlypair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,i,j,sum1,sum2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		n1 = sc.nextInt();
		System.out.println("Enter second number");
		n2 = sc.nextInt();
		sum1=0;
		for(i=1;i<n1;i++){
			if(n1%i==0){
				System.out.println(i);
				sum1=sum1+i;
			}
		}
		System.out.println("sum of factors of first number is "+sum1);
		sum2=0;
		for(j=1;j<n2;j++){
			if(n2%j==0){
				System.out.println(j);
				sum2=sum2+j;
			}
		}
		System.out.println("sum of factors of second number is "+sum2);
		if(sum1==n2 && sum2==n1){
			System.out.println(n1+" and "+n2+" are friendly pair numbers");
		}
		else{
			System.out.println(n1+" and "+n2+" are not friendly pair numbers");
		}

	}

}
