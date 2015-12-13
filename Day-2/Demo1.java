import java.util.Scanner;  // need to import (Ctrl + Shift + O)

//import java.lang.*; by default import
public class Demo1 {

	public static void main(String[] args) {
	/*	int a = 10 ;
		int b = 20 ;
		int c = a + b;
		System.out.println("Sum is "+c);*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		int result = firstNumber + secondNumber ;
		System.out.println("Sum is "+result);
		scanner.close();
		
	}

}
