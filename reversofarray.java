//Reverse of an Array.
package reversofarray;

import java.util.*;

public class reversofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,sum;
		int[] array = new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		n = sc.nextInt();
		sum=0;
		System.out.println("Enter a elements of array");
		for(i=0;i<n;i++){
			array[i]= sc.nextInt();
		}
		System.out.print("original array");
		for(i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		System.out.print("revers array");
		for(i=n;i>=0;i--){
			System.out.print(array[i]+" ");
		}
	}

}
