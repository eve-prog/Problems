import java.util.Scanner;

public class MaxAndMin {
    /*
    Write a program, which:
Reads n representing the count of numbers to read next
Finds the max and the min numbers
Prints them on the console in the following format:
Max number: {max number}
Min number: {min number}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
