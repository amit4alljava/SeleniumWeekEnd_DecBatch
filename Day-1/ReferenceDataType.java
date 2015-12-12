class ReferenceDataType
{
public static void main(String args[])
{
String a = "Hello";
String b = new String("HELLO");
if(a==b){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
//if(a.equals(b)){
if(a.equalsIgnoreCase(b)){
System.out.println("Same Value ");
}
else
{
System.out.println("Not Same Value");
}
}
}