import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primenumb obj = new primenumb();

        if (obj.isPrime(n)) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}

class primenumb {
    boolean isPrime(int a) {
        if (a <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
