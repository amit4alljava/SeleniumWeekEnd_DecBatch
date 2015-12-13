import java.util.Scanner;


public class SwitchCaseDemo {

	public static void main(String[] args) {
		final int BURGER = 1;
		final int PIZZA = 2;
		final int COKE = 3;
		
		System.out.println("1. Burger");
		System.out.println("2. Pizza");
		System.out.println("3. Coke");
		System.out.println("Enter the Choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice){
		case BURGER:
			System.out.println("U Order Burger and Bill is 99 Rs");
			break;
		case PIZZA:
			System.out.println("U Order Pizza and Bill is 299 Rs");
			break;
		case COKE:
			System.out.println("U Order Coke and Bill is 50 Rs");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		

	}

}
