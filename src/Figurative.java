import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Figurative {

    //Reads a string: the figure type
    //Checks if the entered figure is square, rectangle or circle
    //Reads a number for square and circle or two numbers for rectangle
    //Numbers will be floating-point
    //Prints the calculated area formatted to the second digit after the decimal point
    //For unknown figure print "Unknown figure"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();

            if (figureType.equals("circle")){
                double radius = Double.parseDouble(scanner.nextLine());
                double area = radius * radius * Math.PI;
                System.out.printf("%.2f\n", area);
            }else if (figureType.equals("square")){
                double side = Double.parseDouble(scanner.nextLine());
                double area2 = side * side;
                System.out.printf("%.2f\n", area2);
            }else if (figureType.equals("rectangle")){
                double width = Double.parseDouble(scanner.nextLine());
                double higth = Double.parseDouble(scanner.nextLine());
                double area3 = width * higth;
                System.out.printf("%.2f\n", area3);
            }else{
                System.out.println("Unknown figure");
            }
    }
}
