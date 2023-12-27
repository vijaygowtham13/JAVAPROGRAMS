class fruit{
public void color(){
System.out.println("This is a parent class");
}
}
class apple extends fruit{
public void color(){
System.out.println("color is Red");
}
}
class banana extends fruit{
public void color(){
System.out.println("color is Yellow");
}
}
class dynamicpolymorphismp4{
public static void main(String args[]){
fruit m;
m = new banana();
m.color();
m = new apple();
m.color();
m = new fruit();
m.color();
}
}




