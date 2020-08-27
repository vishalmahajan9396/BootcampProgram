//Octal to Binary conversion
package octaltobinary;

import java.util.Scanner;

class octaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp,a;
		int[] array=new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a octel number");
		n= sc.nextInt();
		i=0;
		a=0;
		while(n>0){
			temp=n%10;
			while(temp>0){
				a=temp%2;
				array[i]=a;
				i++;
				temp=temp/2;
			}
			n=n/10;
		}
		for(j=i-1;j>=0;j--){
			System.out.println(array[j]);
		}
	}
}
