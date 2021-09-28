class LogicalOperatorDemoAssign{
public static void main(String[] args)
{
int a = 10 ;
int b = 20 ;
System.out.println( "Logical AND operator");
System.out.println( a>b && a++<b);
System.out.println( "Logical OR operator");
System.out.println( a>b || a++<b);
System.out.println( "Logical NOT operator");
System.out.println( !(a>b));
}
}