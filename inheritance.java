class employee{
 int salary;
 int basic_pay;
 employee(){
    basic_pay = 40000;  
}
}
class programmer extends employee{
  int pcomp;
programmer(){
pcomp = 20000;
 }
int cal_salary(){
  return(basic_pay+pcomp);
}
 }
class techlead extends programmer{
int tcomp;
techlead(){
tcomp=25000;
}
int pcal_salary(){
return (basic_pay+pcomp+tcomp);
}

}

class inheritance{
 public static void main(String[] args){
techlead t = new techlead();
System.out.println("techlead salary is: "+ t.pcal_salary());
programmer p = new programmer();
System.out.println("prog salary is: "+ p.cal_salary());
}
}










