//1. SRP
// 2. DRY - Don't Repeat YourSelf
public class TestEmployee {

	public static void main(String[] args) {
		//int x = 100;  // x is a value variable
		// ram is a reference variable
		Employee ram = new Employee(1001,"Ram",9090);
		ram.setBonus(900.0);
		System.out.println(ram.getId()+" "+ram.getBonus());
		//Employee ram = new Employee();
		//System.out.println("Ram is "+ram);
		/*ram.id = -1001;
		ram.name="Ram";
		ram.salary=-9000;*/
		//ram.takeInput(-1001, "Ram", -9090);
		//ram.print();
		/*System.out.println("Id  "+ram.id); //5555.id
		System.out.println("Name "+ram.name);
		System.out.println("Salary "+ram.salary);
		ram.id = 1001; //5555.id = 1001
		ram.name="Ram";
		ram.salary=9090;
		System.out.println("Id  "+ram.id); //5555.id
		System.out.println("Name "+ram.name);
		System.out.println("Salary "+ram.salary);*/
		System.out.println("*********************************************************");
		Employee shyam = new Employee(1002,"Shyam",8888);
		//System.out.println("Shyam is "+shyam);
		//shyam.takeInput(1002, "Shyam", 6666);
		//shyam.print();
		/*System.out.println("Id  "+shyam.id); //5555.id
		System.out.println("Name "+shyam.name);
		System.out.println("Salary "+shyam.salary);
		shyam.id = 1002; //6666.id = 1002
		shyam.name="Shyam";
		shyam.salary=6666;
		System.out.println("Id  "+shyam.id); //5555.id
		System.out.println("Name "+shyam.name);
		System.out.println("Salary "+shyam.salary);
	*/	// ram and shyam is an instance of a Employee class
	}

}
