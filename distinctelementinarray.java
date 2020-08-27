//Distinct element in the Array.
package distinctelementinarray;

import java.util.*;

public class distinctelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		int[] array = new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		n = sc.nextInt();
		System.out.println("Enter a elements of array");
		for(i=0;i<n;i++){
			array[i]= sc.nextInt();
		}
		System.out.print("original array ");
		for(i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		System.out.print("Distinct elements of array are ");
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				if(array[i] == array[j]){
					break;
				}
			}
			if(i == j){
				System.out.print(array[i] + " ");
			}
		}
	}
}
