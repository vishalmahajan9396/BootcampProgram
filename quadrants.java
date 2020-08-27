/*Quadrants in which a given coordinate lies : 
Take x and y as a input and find in which quadrants coordinate lies.*/
package quadrants;

import java.util.Scanner;

class quadrants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value");
		x = sc.nextInt();
		System.out.println("enter y vlue");
		y = sc.nextInt();
		if(x>0 && y>0){
			System.out.println("Given coordinates is in first quadrant");
		}
		else if(x<0 && y>0){
			System.out.println("Given coordinates is in second quadrant");
		}
		if(x<0 && y<0){
			System.out.println("Given coordinates is in third quadrant");
		}
		else if(x>0 && y<0){
			System.out.println("Given coordinates is in fourth quadrant");
		}
	}
}
