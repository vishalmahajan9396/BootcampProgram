//Prime number within a given range
package primenumberrange;

import java.util.Scanner;

class primenumberrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n1,n2,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		n1 = sc.nextInt();
		System.out.println("Enter a second number");
		n2 = sc.nextInt();
		for(i=n1;i<=n2;i++){
			count=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(i+" is prime number");
			}
			else{
				System.out.println(i+" is not a prime number");
			}
		}
	}
}


