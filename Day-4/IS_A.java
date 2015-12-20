/*
 * IS A- Code Reuse, Polymorphism (One Thing Having Multiple Forms)
 * Overriding When there is Inheritance and Signature must be same 
 */
abstract class Account
{
	int accountNo;
	double balance;
	void deposit(){
		System.out.println("Deposit Call");
	}
	void withDraw(){
		System.out.println("WithDraw Call");
	}
	abstract void roi();
}
class SavingAccount extends Account{
	@Override
	void withDraw(){
		System.out.println("Saving Account with Limit WithDraw Call");
	}
	void doorToDoorService(){
		System.out.println("Door to Door Banking in SavingAccount");
	}
	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}
}
class CurrentAccount extends Account{
	void withDraw(){
		System.out.println("CurrentAccount WithDraw All");
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}
}
public class IS_A {
	// Upcasting
	public static void doAccounting(Account account){
		account.withDraw();
		account.deposit();
		if(account instanceof SavingAccount){
			// DownCasting
			SavingAccount sa = (SavingAccount) account;
			sa.doorToDoorService();
		}
		//account.doorToDoorService();
	}
	public static void main(String[] args) {
		doAccounting(new SavingAccount());
		doAccounting(new CurrentAccount());
		//Account ac = new Account();
		/*SavingAccount sa = new SavingAccount();
		sa.withDraw();
		sa.deposit();
		CurrentAccount ca = new CurrentAccount();
		ca.withDraw();
		ca.deposit();*/

	}

}
