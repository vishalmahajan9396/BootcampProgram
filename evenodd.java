//Even or Odd number
package evenodd;

import java.util.Scanner;

class evenodd {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println(n+" is even number");
		}
		else{
			System.out.println(n+" is odd number");
		}
		
	}

}
