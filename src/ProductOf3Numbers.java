import java.util.Scanner;

public class ProductOf3Numbers {
    public static void main(String[] args) {
        /*
Calculate the sign of the product of 3 numbers:
Read 3 floating-point numbers
Print the sign of the product of the entered 3 numbers: positive, negative or zero
Try to do this without multiplying the 3 numbers
Example
Input
2
3
-1
Output
negative
         */
        Scanner scanner = new Scanner(System.in);
        double nr1 = scanner.nextDouble();
        double nr2 = scanner.nextDouble();
        double nr3 = scanner.nextDouble();
        double product = nr1 * nr2 * nr3;

        if (product > 0){
            System.out.println("positive");
        }else if (product < 0){
            System.out.println("negative");
        }else if (product == 0){
            System.out.println("zero");
        }

    }
}
