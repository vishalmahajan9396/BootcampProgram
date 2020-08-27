//Abundant number
package abundantnumber;

import java.util.Scanner;

class abundantnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		sum=0;
		for(i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum>n){
			System.out.println(n+" is abundant number");
		}
		else{
			System.out.println(n+" is not abundant number");
		}

	}

}
