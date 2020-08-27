//Diamond Number pattern
package diamondnumber;

import java.util.Scanner;

class diamondnuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j,i,a,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of row");
		n = sc.nextInt();
		for(i=1;i<=n/2;i++){
			for(j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		for(i=(n/2)+1;i<=n;i++){
			for(j=(n-i)+1;j<=n;j++){
				System.out.print(" ");
			}
			for(j=n-i;j>=1;j--){
				a=n-i;
				System.out.print(a+" ");
			}
			
			System.out.println();
		}

	}

}
