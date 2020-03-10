import java.util.Scanner;

public class BiggestNumber {
    /*
    Write a program, which:
Reads n - number representing amount of input numbers
Reads n integer numbers
Finds and prints the biggest number
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggestNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > biggestNum){
                biggestNum = num;
            }
        }
        System.out.println(biggestNum);

    }
}
