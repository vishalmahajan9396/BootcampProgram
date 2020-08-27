//Decimal to octal Conversion
package decimaltooctal;

import java.util.Scanner;

class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp;
		int[] array= new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a decimal number");
		n = sc.nextInt();
		i=0;
		while(n>0){
			temp=n%8;
			n=n/8;
			array[i] = temp;
			i++;
		}
		for(j=i-1;j>=0;j--){
			System.out.println(array[j]);
		}
	}
}
