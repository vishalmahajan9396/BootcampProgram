//Highest Common Factor(HCF)
package hcf;

import java.util.Scanner;

class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,i,hcf;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a first number");
		n1=sc.nextInt();
		System.out.println("enter a second number");
		n2=sc.nextInt();
		hcf=0;
		for(i=1;i<=n1 || i<=n2;i++){
			if(n1%i==0 && n2%i==0){
				hcf=i;
				}
		}
		System.out.println("highest common factor is="+hcf);
	}	
}