/*Perfect number : 
	Example :
	Suppose a number  is 28 ;
	Factors of 28 are : 1, 2, 4, 7, 14 ;
	Sum of Factors of the number  = 28 ;
	Here the sum of factors of the number is equal to the given number ;
	So, 28 is a Perfect Number.*/
package perfectnumber;

import java.util.Scanner;

class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		n = sc.nextInt();
		sum=0;
		for(i=1;i<n;i++){
			if(n%i==0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("sum of factors of number is "+sum);
		if(sum==n){
			System.out.println(n+" is perfect number");
		}
		else{
			System.out.println(n+" is not perfect number");
		}
	}
}

