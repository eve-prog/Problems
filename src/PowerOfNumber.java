import java.util.Scanner;

public class PowerOfNumber {
    /*
    Write a program, which:
Reads p – the power and n – the number
Prints the result of n powered by p
Don't use Math.pow()
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < p; i++) {
            result = result * n;
        }
        System.out.println(result);
    }
}
