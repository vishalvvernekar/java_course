class Returndemo1{
static int squareRoot(int number){
int squar = number*number;
if(number==10)
return squar;
System.out.println("squar :"+squar);
return squar;
}
public static void main(String[] args){
int square = squareRoot(20);
System.out.println("square :"+square);
}
}