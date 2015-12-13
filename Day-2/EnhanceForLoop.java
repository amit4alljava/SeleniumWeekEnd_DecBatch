
public class EnhanceForLoop {

	public static void main(String[] args) {
		//int s[]= {10,20,30,40,50};
		//int []s = {10,20,30,40,50};
		int []s = new int[]{10,20,30,40,50};
		//int []s = new int[5];
		//s[0]=222;
		/*for(int i = 0 ; i<s.length ; i++){
			System.out.println(s[i]);
		}*/
		// Enhance for Loop 
		// 1.5
		for(int i : s){
			System.out.println(s[i]);
		}
	}

}
