//Armstrong number in a given range
package armstrongrange;

import java.util.Scanner;

class armstrongrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,temp,result,rem,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		n1 = sc.nextInt();
		System.out.println("Enter a second number");
		n2 = sc.nextInt();
		for(i=n1;i<=n2;i++){
			temp=i;
			result=0;
			rem=0;
			while(temp!=0){
				rem=temp%10;
				result=result+rem*rem*rem;
				temp=temp/10;
			}
			if(i==result){
				System.out.println(i+" is armstrong number");
			}
			else{
				System.out.println(i+" is not armstrong number");
			}
		}
	}
}
