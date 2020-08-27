/*Addition of two fractions: 
	In this article we will create a java program to calculate the sum of two fractions. For this purpose we need to ask the user to enter two fractional values where each fraction must consist a Numerator and a Denominator.
	For understanding this in a better way lets suppose an example :
	Suppose, First fraction consist of 1 as numerator and 3 as denominator, and Second fraction consist of 3 as numerator and 9 as denominator.
	(1 / 3) + (3 / 9) 
	-Find LCM of 3 and 9 and the result will be 9.
	-Multiply 3 in first fraction : (3 / 9) + (3 / 9)
	-Add both fractions and then the result will be : (6 / 9)
	-Now simplify it by finding the HCF of 6 and 9 and the result will be 3.
	-So divide 6 and 9 by 3 and then the result will be : (2 / 3) 
	-This will be your simplified answer for the given problem.*/
package sumoffraction;

import java.util.Scanner;

class sumoffreaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d,n1,n2,n3,d1,d2,d3,i,hcf1,hcf2,sum,a,lcm;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first neumerator");
		n1 = sc.nextInt();
		System.out.println("enter a first denominator");
		d1 = sc.nextInt();
		System.out.println("enter a second neumerator");
		n2 = sc.nextInt();
		System.out.println("enter a second denominator");
		d2 = sc.nextInt();
		n3=0;
		d3=0;
		a=0;
		hcf1=0;
		for(i=1;i<=d1 || i<d2;i++){
			if(d1%i==0 && d2%i==0){
				hcf1=i;
			}
		}
		lcm=d1*d2/hcf1;
		if(lcm==d1 || lcm==d2){
			if(d1<d2){
				n3=n1*d1;
				d3=d1*d1;
				a=n3+n2;
			}
			else if(d1>d2){
				n3=n2*d2;
				d3=d2*d2;
				a=n1+n3;
			}
		}
		else{
			a=n1*d2+n2*d1;
			d3=d1*d2;
		}
		hcf2=0;
		for(i=1;i<=a || i<=d3;i++){
			if(a%i==0 && d3%i==0){
				hcf2=i;
				}
		}
		System.out.println(a+"and"+d3);
		System.out.println(hcf2);
		n=a/hcf2;
		d=d3/hcf2;
		System.out.println("sum is "+n+"/"+d);
	}

}
