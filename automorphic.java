//Automorphic number
package automorphic;

import java.util.Scanner;

class automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b,square,count1,count2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		square=n*n;
		System.out.println(square);
		a=n;
		b=square;
		count1=0;
		while(a!=0){
			a=a/10;
			++count1;
		}
		
		count2=0;
		while(b!=0){
			b=b/10;
			++count2;
		}
		if(count1!=count2){
			System.out.println(n+" is automorphic number");
		}
		else{
			System.out.println(n+" is not a automorphic number");
		}
	}
}
