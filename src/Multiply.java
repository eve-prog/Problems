import java.util.Scanner;

public class Multiply {
    /*
Write a program, which:
Reads n
Prints n's multiples in the format "{n} x {i} = {result}"
Where i are the numbers from 1 to 10 (inclusive)
2 x 1 = 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
