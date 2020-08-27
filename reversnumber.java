//Reverse of a number
package reversnumber;

import java.util.Scanner;

class reversnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,res;
		String rev=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		res=0;
		while(n!=0){
			res=n%10;
			n=n/10;
			rev=rev+res;
		}
		System.out.println("reverse of the given number is "+rev);
	}
}
