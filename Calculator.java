package Oops;

import java.util.Scanner;

public class Calculator {
	
	static void checkOperation(int operation, int num, int num1, int total) {
		
		//check for the operation number entered by the user
		switch(operation) {
	
		//if the user enters 1 the case 1 will perform addition
		case 1:
			total = num + num1;
			System.out.println("Total of "+num+ " + "+num1+ " is : " +total);
			break;
			
		//if the user enters 2 the case 2 will perform substraction	
		case 2:
			total = num - num1;
			System.out.println("Total of "+num+ " - "+num1+ " is : " +total);
			break;
		
		//if the user enters 3 the case 3 will perform multiplication	
		case 3:
			total = num * num1;
			System.out.println("Total of "+num+ " * "+num1+ " is : " +total);
			break;
		
		//if the user enters 4 the case 4 will perform division	
		case 4:
			total = num / num1;
			System.out.println("Total of "+num+ " / "+num1+ " is : " +total);
			break;
			
			default:
			System.out.println("Invalid Operation");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//user will select any option and type the number between 1 to 4
		System.out.println("Select Any One Option : ");
		System.out.println("1: Addition");
		System.out.println("2: Substraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		int operation = scan.nextInt();
		 
		System.out.println("Enter any Two Numbers : ");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		int total=0;
		
		checkOperation(operation, num, num1, total);
		
		
	}

}
