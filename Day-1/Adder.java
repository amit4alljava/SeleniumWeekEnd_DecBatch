class Adder
{
public static void main(String args[]){
// Local Variable has to be initalize first before use
int firstNumber  = Integer.parseInt(args[0]);  // Variable must be start with small letter
int secondNumber = Integer.parseInt(args[1]);
int result = firstNumber + secondNumber;
System.out.println("Sum of Two Numbers "+result);
}
}