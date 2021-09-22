class refrigerator{
String brandname;
String color;
String type;
int grossvolume, storagevolume;
void type(){
System.out.println(color+" "+brandname+" refrigerator is direct cooling...!");
}
void grossvolume(){
System.out.println(color+" "+brandname+" refrigerator grossvolume is 192 liters...!");
}
void storagevolume(){
System.out.println(color+" "+brandname+" refrigerator storagevolume is 182 liters...!");
}
public static void main(String[] args){
refrigerator samsung = new refrigerator();
samsung.brandname = "Samsung";
samsung.color = "red";
samsung.type();
samsung.grossvolume();
samsung.storagevolume();
}
}