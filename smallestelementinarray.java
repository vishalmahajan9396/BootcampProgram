//Smallest element in the array
package smallestelementinarray;

import java.util.Scanner;

class smallestelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp;
		int[] array = new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		n = sc.nextInt();
		
		System.out.println("Enter a elements of array");
		for(i=0;i<n;i++){
			array[i]= sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(array[i]>array[j]){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
		System.out.println("smallest element is "+array[0]);

	}

}
