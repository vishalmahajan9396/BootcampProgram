//Positive or Negative number
package positivenegative;

import java.util.Scanner;

class positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		if(n>0){
			System.out.println(n+" is positive");
		}
		else {
			System.out.println(n+" is negative");
		}

	}

}
