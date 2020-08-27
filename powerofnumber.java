//Power of a number
package powerofnumber;

import java.util.Scanner;

class powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pow,i,count,prod,a,base;
		Scanner sc = new Scanner(System.in);
		
		count=0;
		System.out.println("enter a number");
		n=sc.nextInt();
		System.out.println("enter a power");
		pow=sc.nextInt();
		a=0;
		base=1;
		if(n>0){
			a=n**pow;
		}
		System.out.print("power of number is= "+a);
		
	}
}