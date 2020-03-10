import java.util.Scanner;

public class RectangleBorder {
    /*
    Write a program to check if a point {x, y} is on some of the sides of a rectangle {x1, y1} – {x2, y2}.
Input
The input comes from the console and it consists of 6 rows, introduced from the user: real numbers x1, y1, x2, y2, x and y (it will be always true that x1 < x2 and y1 < y2).
Output
If the point lies on one of the rectangle's sides:
Print "Border"
If the point does NOT lie on a side:
Print "Inside / Outside"
* Hint: use one or more conditional if statements with logical operations. A point {x, y} lies on aside of a rectangle {x1, y1} – {x2, y2}, if one of the specified conditions is fulfilled:
x equals x1 or x2 and at the same time y is between y1 and y2
y equals y1 or y2 and at the same time x is between x1 and x2
You can check the conditions above using one more complicated if-else construction or using few more simple conditional statements or nested if-else statements.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());


        if ((x == x1 || x == x2) && (y >= y1) && (y <= y2)) {
            System.out.println("Border");
        } else if((y == y1 || y == y2) && (x >= x1) && (x <= x2)){
            System.out.println("Border");
        } else{
            System.out.println("Inside / Outside");
        }
    }
}
