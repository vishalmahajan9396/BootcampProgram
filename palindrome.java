//Palindrome number
package palindrome;

import java.util.Scanner;

class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		x=n;
		rev=0;
		while(x!=0){
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println(rev);
		if(rev==n){
			System.out.println(n+" is palindrome number");
		}
		else{
			System.out.println(n+" is not palindrome number");
		}
	}

}
