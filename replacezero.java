//Replace all 0’s with 1 in a given integer
package replacezero;

import java.util.Scanner;

class replacezero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,i,j;
		int[] array= new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		i=0;
		while(n>0){
			temp=n%10;
			if(temp==0){
				array[i]=1;
			}
			else{
				array[i]=temp;
			}
			i++;
			n=n/10;
		}
		for(j=i-1;j>=0;j--){
			System.out.println(array[j]);
		}

	}

}
