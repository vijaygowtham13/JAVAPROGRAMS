class Inheritanceusingaccess {
    private int a;
    int b;

    int getA(int a) {
        return a;
    }

    void onlyB() {
        
        System.out.println("b is " + b);
    }

    static class Zero extends Inheritanceusingaccess {
        int x;

        void method() {
            System.out.println("x is " + x);
        }
    }

    public static void main(String args[]) {
       Zero ob = new Zero();
        ob.x = 23;
    
        ob.b = 21;

    
        int aValue = ob.getA(43);
        System.out.println("a is " + aValue);

        ob.onlyB();
        ob.method();
    }
}
