
public class LoopingDemo {

	public static void main(String[] args) {
		// 1st Loop
		/*int i = 1;
		while(i<=10){
			if(i==1){
				i++;
			}
			System.out.println("I Is "+i);
			//i++; // i =i+1
		 //i = i + 2;
			i+=2;
		}*/
		
		// 2nd Loop
		//for loop
		/*for(int i = 10; i>=1 ; i--){
			System.out.println("I is "+i);
		}*/
		
		// 3rdLoop
		/*int i = 10;
		do{
			System.out.println("It will execute at least once");
		}while(i<=5);*/
		
		// Nested Loop
		for(int i = 1 ; i<=3 ; i++){
			for(int j = i; j>=1 ; j--){
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
