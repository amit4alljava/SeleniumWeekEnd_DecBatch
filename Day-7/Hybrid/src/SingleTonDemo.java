// Only One Object we can create
 // Need of SingleTon - Create Only One Object and when u request again
// and again , it will return the same object , so it will create a 
// new object again
class A
{
	// Step -1 Define a static object
	// it has only one copy in the memory
	private static A obj = null;
	// Step -2 Create a private constructor,
	// so no one from outside the class can create the object directly (by using new)
	private A(){
		
	}
	// Step-3 we have static method and this will check object is alredy 
	// created or not, if the obj is null then only it create a new object
	// and if is not null so it will return the previous object (older object)
	public static A getObject(){
		if(obj==null){
			obj = new A();
		}
		return obj;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		A obj = A.getObject();
		A obj2 = A.getObject();
		System.out.println(obj);
		System.out.println(obj2);
		if(obj==obj2){
			System.out.println("Same ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
