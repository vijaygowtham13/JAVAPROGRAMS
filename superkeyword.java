class box{
private double height;
private double depth;
private double width;
box(double h,double d,double w){
height=h;
depth=d;
width=w;
}
box(box tu){
height=tu.height;
depth=tu.depth;
width=tu.width;
}
}
class boxweight extends box{
double weight;
boxweight(double h,double d,double w,double wt){
super(h,w,d);
weight=wt;
}

boxweight(boxweight tu){
super(tu);
weight=tu.weight;
}
}
class superkeyword{
public static void main(String args[]){
boxweight ob1 = new boxweight(21,32,12,31);
System.out.println("ob1's weight "+ob1.weight);
boxweight ob2 = new boxweight(ob1);
System.out.println("ob2's weight "+ob1.weight);

}
}