class access{
public int a;
private int b;
protected int c;
access(){
a=10;
b=20;
c=30;
}
void method(int x,int y,int z){
a=x;
b=y;
c=z;
}


public static void main(String[] args){
access ob =new access();

System.out.println("a is"+ob.a+"c is"+ob.c+"b is"+ob.b);


}
}




