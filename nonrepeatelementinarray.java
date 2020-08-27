//Non repeating element in the array.
package nonrepeatelementinarray;

import java.util.Scanner;

public class nonrepeatelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,count;
		int[] array = new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		n = sc.nextInt();
		System.out.println("Enter a elements of array");
		for(i=0;i<n;i++){
			array[i]= sc.nextInt();
		}
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(i!=j && array[i] == array[j]){
					count++;
				}
			}
			if(count == 0){
				System.out.println(array[i]+" is non repeated element in array");
			}
		}
	}
}
