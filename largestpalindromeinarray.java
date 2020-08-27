//Longest palindrome in the Array.
package largestpalindromeinarray;

import java.util.*;

public class largestpalindromeinarray {
	public static boolean paLindrome(int n){
		int x,rev;
		x=n;
		rev=0;
		while(x!=0){
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println(rev);
		if(rev==n){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp,p=0;
		int[] array = new int[64];
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
		
		for(i=n;i>=0;i--){
			if(paLindrome(array[i])){
				p=array[i];
			}
		}
		System.out.println(p+" is largest palindrome in array");

	}

}
