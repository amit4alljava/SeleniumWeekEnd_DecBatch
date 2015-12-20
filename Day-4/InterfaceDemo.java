// interface --> What to do?
// class --> How to do?
//100 % Abstract
// Prototype Design 
// What to do
// interface = Constant + abstract methods
interface IPlayer
{
	int MAXJUMP= 100;
	int MAXPOWER = 100;
	int DEFAULTPOWER = 10;
	void run();
	void jump();
	void powerIncrement();
}
interface SuperPowers{
void getSuperPower();
}
// How to Do
class RedPlayer implements IPlayer,SuperPowers{
int power = DEFAULTPOWER;
	@Override
	public void run() {
		System.out.println("Run Fast");
		
	}

	@Override
	public void jump() {
		System.out.println("Jump High");
		
	}

	@Override
	public void powerIncrement() {
		if(power<MAXPOWER){
			power++;
		}
		System.out.println("Power Increase by 20%");
		
	}

	@Override
	public void getSuperPower() {
		// TODO Auto-generated method stub
		
	}
	
}

class BlackPlayer implements IPlayer{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerIncrement() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		RedPlayer redPlayer = new RedPlayer(); //Parent + Child (Extra)
		IPlayer player = new RedPlayer();  // Parent + Child(Override , No Extra Allowed)
		player.jump();
		player.run();
		player.powerIncrement();

	}

}
