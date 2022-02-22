package Oops;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static void checkArmstrong(int num, int sum) {
		//if the user entered number and its armstrong value which is stored in sum
		//is equal then it is an Armstrong Number
		if (num == sum)
		{
			System.out.println(num+" is an Armstrong Number");
		}
		else
		{
			System.out.println(num+" is Not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Natural Number : ");
		int num = scan.nextInt();
		
		int temp=num;
		int remain,sum=0;
		while(temp>0)
		{
			//breaking the user entered number into pieces by using modulo
			//And storing the remainder in remain
			remain = temp%10;
			temp = temp/10;
			
			//sum is for storing the exsisting value which will become previous value in the loop
			//taking the cube of remainder value
			//the armstrong value of the user entered value is stored in sum after the loop ends
			sum = remain*remain*remain + sum;
		}   
		
		checkArmstrong(num, sum);
	//	System.out.println(sum);
/*		if (num == sum)
		{
			System.out.println(num+" is an Armstrong Number");
		}
		else
		{
			System.out.println(num+" is Not an Armstrong Number");
		}  */
	}

}
