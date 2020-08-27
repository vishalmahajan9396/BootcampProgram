//Palindromic Pyramid pattern
package pallindromepyramid;

import java.util.Scanner;

class pallindromepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("entr a number of row");
		n = sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=i;j<n;j++){
				System.out.print("  ");
			}
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(j=i-1;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
