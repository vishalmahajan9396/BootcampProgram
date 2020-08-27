//Armstrong number
package armstrong;

import java.util.Scanner;

class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,result,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		temp=n;
		result=0;
		while(temp!=0){
			rem=temp%10;
			result=result+rem*rem*rem;
			temp=temp/10;	
		}
		if(n==result){
			System.out.println("Given number is armstrong number");
		}
		else{
			System.out.println("Given number is not a armstrong number");
		}
	}
}
