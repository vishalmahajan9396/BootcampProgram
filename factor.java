//Factor of a number
package facctors;

import java.util.Scanner;

class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		for(i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}
}
