//Program for Pyramid star pattern.
package pyramidstar;

import java.util.Scanner;

class pyramid {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of row");
		n = sc.nextInt();
		for(i=0;i<n;i++){
			for(j=n-i;j>1;j--){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
