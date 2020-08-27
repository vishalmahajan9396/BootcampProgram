//Floyd’s Triangle
package floydstriangle;

import java.util.Scanner;

class floydstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of row");
		n = sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=n-i;j>=1;j--){
				System.out.print("");
			}
			for(j=1;j<=i;j++){
				sum=sum+1;
				System.out.print(sum+" ");
			}
			
			System.out.println();
		}

	}

}
