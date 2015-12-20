class Customer{
	int id;
	String name;
	String phone;
	Customer(int id , String name, String phone){
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
}
class Order{
	int oid;
	String desc;
	Order(int oid, String desc){
		this.oid = oid;
		this.desc =desc;
	}
}

public class PassingObjectReturn {
static void printCustomer(Customer customer){
	System.out.println("Id "+customer.id);
	System.out.println("Name "+customer.name);
	System.out.println("Phone "+customer.phone);
}
static Order giveOrderInfo(Customer customer){
	if(customer.id>1001){
		Order order = new Order(1001,"Mobile");
		return order;
	}
	return new Order(1000,"LED");
}
static void editCustomer(int id, String name, String phone){
	id++;
	phone="3333";
	
}

static void editCustomer(Customer customer){
	customer.id++;
	customer.phone="33333";
	
}
	public static void main(String[] args) {
		Customer ram = new Customer(1001,"Ram","22222");
		PassingObjectReturn.editCustomer(ram);
		PassingObjectReturn.printCustomer(ram);
		

	}

}
