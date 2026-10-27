import java.util.Scanner;

public class task6 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void countPrimesInRange(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Prime Count = " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        countPrimesInRange(a, b);
    }
}
