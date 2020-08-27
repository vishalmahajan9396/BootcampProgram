//Leap year or not
package leapyear;

import java.util.Scanner;

class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year ");
		year = sc.nextInt();
		if(year%4==0){
			if(year%100!=0){
				if(year%400==0){
					System.out.println(year+" is leap year");
				}
				else{
					System.out.println(year+" is not leap year");
				}
			}
			else{
				System.out.println(year+" is leap year");
			}
			}
		else{
			System.out.println(year+" is not leap year");
		}

	}

}
