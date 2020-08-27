//Sum of elements in the array.
package sumofelementinarray;

import java.util.*;

public class sumofekementinarray {

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
		for(i=0;i<n;i++){
			sum=sum+array[i];
		}
		System.out.println("sum of element is "+sum);

	}

}
