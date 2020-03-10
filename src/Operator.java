import java.util.Scanner;

public class Operator {
    /*
    Write a program to apply an operator for given two numbers:
Read two integers and math operator from the console
The math operator could be: "+", "-", "/", "%" and "*"
The output should be in the following format: "{N1} {operator} {N2} = {result}"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr1 = Integer.parseInt(scanner.nextLine());
        int nr2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (operator.equals("+")) {
            System.out.printf("%s %s %s = %s\n", nr1, operator, nr2, nr1 + nr2);
        } else if (operator.equals("-")) {
            System.out.printf("%s %s %s = %s\n", nr1, operator, nr2, nr1 - nr2);
        } else if (operator.equals("/")) {
            System.out.printf("%s %s %s = %s\n", nr1, operator, nr2, nr1 / nr2);
        } else if (operator.equals("%")) {
            System.out.printf("%s %s %s = %s\n", nr1, operator, nr2, nr1 % nr2);

        } else if (operator.equals("*")) {
            System.out.printf("%s %s %s = %s\n", nr1, operator, nr2, nr1 * nr2);
        }
    }

}