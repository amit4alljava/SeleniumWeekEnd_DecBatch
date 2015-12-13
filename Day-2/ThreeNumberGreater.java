import java.util.Scanner;


public class ThreeNumberGreater {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter the Third Number");
		int thirdNumber = scanner.nextInt();
		// && all conditions must be true
		// || either one of the condition is true
		// ! true --> false  ,  false -->true
		// Multiple if else
		/*if(firstNumber>secondNumber && firstNumber>thirdNumber){
			System.out.println("First Number is Greater...");
		}
		else
		if(secondNumber>firstNumber && secondNumber>thirdNumber){	
			System.out.println("Second Number is Greater...");
		}
		else
		if(firstNumber==secondNumber && firstNumber==thirdNumber){
			System.out.println("All are Same");
		}
		else
		{
			System.out.println("Third Number is Greater...");
		}*/
		// Nested if else
		if(firstNumber>secondNumber){
			if(firstNumber>thirdNumber){
				System.out.println("First Number is Greater...");
			}
			else
			if(thirdNumber>secondNumber)	
			{
				System.out.println("Third Number is Greater...");
			}
		}
		else
		if(secondNumber>thirdNumber)	
		{
			System.out.println("Second Number is Greater...");
		}
	}

}
