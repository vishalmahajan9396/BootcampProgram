/*Maximum number of handshakes: 
	Here we will discuss how to find the maximum number of handshakes which can happen between N number of people given the fact that any two people shake hands exactly once using java programming language.
	For the number of handshakes to be maximum, every person should shakehand with every other person in the room i.e all persons present should shake hands. For the first person, there would be N-1 people to shake hands. For second person there would N-1 people available but as he had already shaken hands with the first person,  there would be N-2 people to shake hands and so on.
	Therefore the total number of handshake = (N-1 + N-2 +….+ 1 + 0),
	which is equivalent to ((N-1)*N)/2.*/
package handshakes;

import java.util.Scanner;

class handshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of peoples");
		n = sc.nextInt();
		sum=(n*(n-1))/2;
		System.out.println("total number handshake are "+sum);

	}

}
