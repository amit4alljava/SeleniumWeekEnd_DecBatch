import java.util.Scanner;


public class PatternDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Range");
		Scanner scanner = new Scanner(System.in);
		int range = scanner.nextInt();
		/*for(int row = 1; row<=range; row++){
			for(int col=1 ; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
			
		}*/
		
		
		for(int row = 1; row<=range; row++){
			for(int col=range ; col>=row; col--){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		scanner.close();

	}

}
