class factorial {
    public static void main(String[] args) {
        facto obj = new facto();
        System.out.println(obj.fact());
    }
}

class facto {
    int n = 4;
    int c = 1;

    int fact() {
        for (int i = 1; i <= n; i++) {
            c = c * i;
        }
        return c;
    }
}
