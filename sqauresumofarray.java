//Square sum of an Array.
package squaresumofarray;

import java.util.*;

public class sqauresumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,sum,sqr;
		int[] array = new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		n = sc.nextInt();
		sum=0;
		sqr=0;
		System.out.println("Enter a elements of array");
		for(i=0;i<n;i++){
			array[i]= sc.nextInt();
		}
		for(i=0;i<n;i++){
			sqr=array[i]*array[i];
			sum=sum+sqr;
		}
		System.out.println("sum of element is "+sum);


	}

}
