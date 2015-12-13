import java.util.Scanner;


public class ConditionalPrograms {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		if(firstNumber>secondNumber) // true
		{
			System.out.println("First Number is Greater....");
		}
		else
		if(firstNumber==secondNumber){
			System.out.println("Same Numbers");
		}
		
		else  // false
		{
			System.out.println("Second Number is Greater...");
		}
		scanner.close();
	}

}
