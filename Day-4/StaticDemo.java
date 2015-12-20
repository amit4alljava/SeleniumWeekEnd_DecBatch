import java.util.ArrayList;

class A
{
	int x;  // Instance Var
	String z = new String("Hello");
	static int y;  // class var
	static void show(){
		System.out.println("A Show");
	}
	A(){
		x++;
		y++;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
	}
}
public class StaticDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Start "+A.y);
		A.show();
		/*A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();*/
		ArrayList list = new ArrayList();
		while(true){
			A obj = new A();
		list.add(obj);
		Thread.sleep(30);
		}
	}

}
