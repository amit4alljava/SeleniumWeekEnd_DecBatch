// Functionality
// Class - SRP - Single Responsiblity Principle (OOAD)
// OOP Principle
// 1. Encapsulation - Binding of Variables and Methods into Single Unit
// Example of Encapsulation - Class is an Example
// 2. Data Hiding - > Private makes Data Hiding
// 3. Gud Encapsulation --> Encapsulation + Data Hiding
//  private Variables + public methods + Binding
public class Employee {
	// Scope of Id , the Scope is default scope , with in the package
	// Primary Fields (id, name, salary)
	// Secondary Fields (bonus, phone ,email, address, deptName, managerName)
	private int id; // Instance Variables 
	private String name; 
	private double salary;
	private String companyName;
	private double bonus;
	private String phone;
	private String email;
	private String address;
	private String deptName;
	private String managerName;
	
	// this is the default constructor and it is reside in each class by default
	// Constructor Name is same as class name
	// it return nothing
	// it is used to initalize the instance variables
	Employee(){
		companyName="HCL";
		System.out.println("This is Default Constructor Call...");
	}
	Employee(int id , String name, double salary){
		this(); // it will the default constructor first
		// this() must be in first line
		this.id = id;
		this.name = name;
		this.salary =salary;
		System.out.println("This is Param Constructor Call...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getId() {
		return id;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	
	
	// Instance Methods
	// Verb
	/*public void takeInput(int id , String name , double salary){
		// this --> it is a keyword and it hold the current reference
		//System.out.println("This is "+this);
		if(id>0 && salary>0){
		this.id = id;
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Id or Salary");
		}
	}*/
	
	// Verb
	/*public void print(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
	}*/

}
