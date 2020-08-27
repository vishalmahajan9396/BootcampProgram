//Prime number
package primenumber;

import java.util.Scanner;

class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		count=0;
		for(i=1;i<=n;i++){
			if(n%i==0){
				count++;	
			}
		}
		if(count==2){
			System.out.println(n+" is a prime number.");
		}
		else{
			System.out.println(n+" is not a prime number.");
		}
	}
}
