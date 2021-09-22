class cycle{
String companyname;
String color;
int noOftyres;
void strenght(){
System.out.println(color+" "+companyname+" cycle is having good mechanical strenght...!");
}
void changinggear(){
System.out.println(color+" "+companyname+" cycle is having gear system...!");
}
public static void main(String[] args){
cycle bsa= new cycle();
bsa.companyname = "Bsa";
bsa.color = "green";
bsa.noOftyres = 2;
bsa.strenght();
bsa.changinggear();
}
}