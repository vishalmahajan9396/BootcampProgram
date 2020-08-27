/*Can a number be expressed as a sum of two prime numbers
	In this article we will ask the user to enter a positive integer and check whether that number can be expressed as the sum of two prime numbers. If that number can be expressed as sum of two prime numbers then print the numbers in the output and else print the statement that the number cannot be expressed as a sum of two prime numbers.*/
package expressprimesum;

import java.util.Scanner;

class expressprimesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,k,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n= sc.nextInt();
		count=0;
		for(k=2;k<=n/2;k++){
			for(i=1;i<=k || i<=n-k;i++){
				if(k%i==0 && (n-k)%i==0){
					count++;	
				}
			}
			if(count==2){
				//System.out.println(n+" is represented as a sum of primes "+k+" and "+(n-k));
				
			}
		}
		
	}
}