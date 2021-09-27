class BitwiseOperatorAssignment2{
public static void main(String[] args){
int x=40;
int y=80;
System.out.println(x>y && ++x<y);
System.out.println("x :"+x);
System.out.println(x<y & ++x>y);
System.out.println("x :"+x);
System.out.println(x!=y || x++ !=y);
System.out.println("y :"+y);
System.out.println(x!=y | x++!=y);
System.out.println("y :"+y);

}
}