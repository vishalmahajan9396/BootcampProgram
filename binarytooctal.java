//Binary to Octal conversion
package binarytooctal;

import java.util.Scanner;

class binarytooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[32];
		int n,temp,a,b,base,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a binary number");
		n = sc.nextInt();
		temp=0;
		i=0;
		while(n>0){
			a=0;
			b=0;
			base=1;
			temp=n%1000;
			while(temp>0){
				a=temp%10;
				temp=temp/10;
				b=b+a*base;
				base=base*2;	
			}
			array[i]=b;
			i++;
			n=n/1000;
		}
		for(j=i-1;j>=0;j--){
			System.out.println(array[j]);
		}
	}
}
