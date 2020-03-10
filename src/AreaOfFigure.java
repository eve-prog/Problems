import java.util.Scanner;

public class AreaOfFigure {
    public static void main(String[] args) {
        /*
Write a program where user enters type and dimensions of a geometric figure and calculates its area.
Figures are four types: square, rectangle, circle and triangle.
On the first line of the input you will receive the type of the figure.
If it's square, on the next line you will be given a number representing length of his size.
If the type is rectangle, on the next two lines you have to read its dimensions.
f it's circle - on the next line you will receive a single number - the radius.
If the figure is triangle, on the next two lines you will be given the length of its size and the height to it.
The input numbers will be floating-point numbers.
Output
The result should be formatted to the third decimal point.
         */

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if(type.equals("square")){
            double sideA = scanner.nextDouble();
            double area = sideA * sideA;
            System.out.printf("%.3f", area);
        }else if(type.equals("rectangle")) {
            double sideA = scanner.nextDouble();
            double sideB = scanner.nextDouble();
            double area = sideA * sideB;
            System.out.printf("%.3f", area);
        }else if(type.equals("circle")) {
            double radius = scanner.nextDouble();
            double area = radius * radius * Math.PI;
            System.out.printf("%.3f", area);
        }else if(type.equals("triangle")) {
        double length = scanner.nextDouble();
        double high = scanner.nextDouble();
        double area = length * high/2;
        System.out.printf("%.3f", area);

        }
    }
}


