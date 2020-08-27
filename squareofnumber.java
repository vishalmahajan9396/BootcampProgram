package squareofnumber;

import java.util.Scanner;

public class squareofnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		temp=0;
		//temp=n*n;
		//System.out.println("square of number is "+temp);
		if(n!=0){
			temp=n*n;
			System.out.println("square of number is "+temp);
		}
		else{
			System.out.println("square is 0");
		}
	}

}
