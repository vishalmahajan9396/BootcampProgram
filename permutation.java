/*Permutations in which n people can occupy r seats in a classroom :  
	Here we will discuss how to find the number of ways N people can occupy R seats in a classroom in java programming language.
	This is a problem specific program which deals with problems like in how many ways employees can be arranged in the seats available in a company or the same for the students in a school or college.
	This problem can be easily solved by the use of the simple formula of permutations which is
	nPr =    n! / (n-r)!
	Example: we have 5 students and the total number of seats are 6.
	Permutations  =    6P5
	=    6! / (6-5)!
	=    720.
	So, there are 720 ways in which 5 students can be arranged in 6 seats.*/
package permutation;

import java.util.Scanner;

class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,i,mul,a,b,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of people");
		n= sc.nextInt();
		System.out.println("enter a number of seats");
		r= sc.nextInt();
		mul=1;
		b=1;
		for(i=n;i>1;i--){
			mul=mul*i;
		}
		a=n-r;
		for(i=a;i>=1;i--){
			b=b*i;
		}
		p=mul/b;
		System.out.println("number of possible ways are "+p);

	}

}