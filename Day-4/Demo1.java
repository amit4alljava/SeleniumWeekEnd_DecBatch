// String is a collection of characters
// String is a Class 
// String use String Pool
// String is a final class
// String is Immutable
public class Demo1 {

	public static void main(String[] args) {
		String x = "amit";  // String Literal  (1 or 0 Object)
		String y = "amit";  
		String z = new String("amit");  // String Object (2 or 1 )
		String m = new String("Hello");
		if(x==y){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		x = "ram@yahoo.com";
		System.out.println(x+"  "+y);
		if(x==y){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.indexOf("yahoo"));
		System.out.println(x.lastIndexOf("."));
		System.out.println(x.startsWith("ram"));
		System.out.println(x.endsWith(".com"));
		System.out.println(x.equals("ram@yahoo.com"));
		System.out.println(x.equalsIgnoreCase("RAM@yahoo.com"));
		System.out.println(x.contains("yahoo"));
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 5));  //index - 0, position -1
		System.out.println(x.replace("a", "x"));
		System.out.println(x.charAt(0));
		String r ="mike";
		String e = "tim";
		System.out.println(x.concat(r).concat(e));
		System.out.println(x+r+e);
		System.out.println("["+"       Amit         Srivastava          ".trim()+"]");
		String address ="A-10,Shakti Nagar,Delhi-7";
		String array[]=address.split(",");
		for(String e1 : array){
			System.out.println(e1);
		}
		System.out.println();
		System.out.println();
	}

}
