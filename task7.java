import java.util.Scanner;

public class task7 {
    public static long factorial(int n) {
        if (n < 0) {
            return 
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial = " + factorial(n));
      
    }
}
