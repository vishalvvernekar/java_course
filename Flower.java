class Flower {
String name;
String color;
int noOfpetals;
void bloom(){
System.out.println(color+" "+name+" is blooming...!");
}
void shedFragrance(){
System.out.println(color+" "+name+" is shedding fragrance...!");
}
public static void main(String[] args){
Flower rose= new Flower();
rose.name = "Rose";
rose.color = "yellow";
rose.noOfpetals = 16;
rose.bloom();
rose.shedFragrance();
}
}