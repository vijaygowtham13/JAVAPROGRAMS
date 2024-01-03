class box{
private double height;
private double depth;
private double width;
box(double h,double d,double w){
height=h;
depth=d;
width=w;
}
box(){
height=depth=width=-1;
}
box(box ob){
height=ob.height;
depth=ob.depth;
width=ob.width;
}
double vol(){
return(height*depth*width);
}
}
class inheripractice{
public static void main(String args[]){
box ob1 = new box(4,5,7);
System.out.println("the volume is "+ob1.vol());
box ob2 = new box();
System.out.println("the volume is "+ob2.vol());
box ob3 = new box(ob1);
System.out.println("the volume is "+ob3.vol());
}
}