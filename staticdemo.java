class hello{
static int a=10;
static int b=20;
static int c;
static void integer(int n){
System.out.println("The n value is:"+n);
System.out.println("The a value is:"+a);
System.out.println("The b value is:"+b);
System.out.println("The c value is:"+c);
}
static{
c=30;


}
}
class staticdemo{
public static void main(String[] args){
hello.integer(23);

}


}




