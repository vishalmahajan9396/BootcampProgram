//Decimal to Binary conversion
package decimaltobinary;

import java.util.Scanner;

class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,i,j;
		int[] array= new int[32];
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a decimal number");
		n = sc.nextInt();
		i=0;
		while(n>0){
			temp=n%2;
			n=n/2;
			array[i]=temp;
			i++;
		}
		for(j=i-1;j>=0;j--){
			System.out.println(array[j]);
		}
	}
}