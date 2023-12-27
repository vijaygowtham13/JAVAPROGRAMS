 class Employee {

    private String name;
    private int age;
    private String designation;

   
    public Employee() {
        System.out.println("Employee class created with no arguments");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("Employee class created with one argument");
    }

     
   public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee class created with two arguments");
    }
    public void setName() {
        System.out.println("Name set to " + this.name);
    }

    
    public void setAge(int age) {
        this.age = age;
        System.out.println("Age set to " + this.age);
    }

    public void setDesignation(String designation) {
        this.designation = designation;
        System.out.println("Designation set to " + this.designation);
        
    }
}
class constructor{
  
    public static void main(String[] args) {
        Employee ob1 = new Employee();
        Employee ob2 = new Employee("vijaygowtham");
        Employee ob3 = new Employee("vijaygowtham", 20);
    

     
        ob1.setName();
        ob2.setAge(25);
        ob3.setDesignation("Software Engineer");
        ob1.setName();
        ob2.setAge(35);
        ob3.setDesignation("Tester");
    }
}
