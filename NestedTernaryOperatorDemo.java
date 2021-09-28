class NestedTernaryOperatorDemo{
public static void main(String[] args)
{
int x=50,y=100,z=150;
int largest=(x>y)?((x>y)?x:z):((y>z)?y:z);
System.out.println("Largest Number:"+largest);
}
}