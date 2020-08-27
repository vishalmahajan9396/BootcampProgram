/*Strong number : 
 	Let us consider an example :
Suppose we have a number 145 then,
Factorial of all digits –
Factorial of 1 = 1 ;
Factorial of 4 = 24 ;
Factorial of 5 = 120 ;
Sum of Factorial of all digits –
1 + 24 + 120 = 145 ;
Here the calculated result is equal to the given number ;
So, 145 is a Strong Number.*/
package strongnumber;

import java.util.Scanner;

class strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,a,temp=0,mul,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		a=n;
		while(a!=0){
			temp=a%10;
			//System.out.println(temp);
			mul=1;
			for(i=temp;i>=1;i--){
				mul=mul*i;
			}
			sum=sum+mul;
			a=a/10;
		}
		//System.out.println(sum);
		if(sum==n){
			System.out.println("given number is a strong number");
		}
		else{
			System.out.println("given number is not a strong number");
		}

	}

}
