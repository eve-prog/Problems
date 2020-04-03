import java.util.Scanner;

public class ZigZagSum {
    /*
    Write a program, which:
Reads n - number representing amount of input numbers
Reads n integers
For every even line adds the number to the result
For every odd line subtracts the number from the result
The counting starts from 1.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();

            if (i % 2 == 1) {
                sum = sum + number;
            }else{
                sum = sum - number;
            }
        }
        System.out.println(sum);
    }
}
