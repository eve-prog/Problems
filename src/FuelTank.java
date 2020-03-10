import java.util.Scanner;

public class FuelTank {
    /*
    Write a program that knows whether the tank of a vehicle needs refueling or not.
Input
The input is consists of 2 lines:
First you have to read from the console the type of fuel - text with options: "Diesel", "Gasoline" or "Gas"
The second line of input reads the fuel in the tank in liters
Output
If the fuel is other than the specified print "Invalid fuel!".
Otherwise if the fuel in the tank is more than or equal to 25 liters print:
"You have enough {type of fuel}."
Type of the fuel should be printed in lower case.
Otherwise print:
"Fill your tank with {type of fuel}!".
Type of the fuel should be printed in lower case.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double litersOfFuel = scanner.nextDouble();

        switch (fuel) {
            case "Diesel":
                if (litersOfFuel >= 25) {
                    System.out.println("You have enough diesel.");
                } else {
                    System.out.println("Fill your tank with diesel!");
                }
                break;

            case "Gasoline":
                if (litersOfFuel >= 25) {
                    System.out.println("You have enough gasoline.");
                } else {
                    System.out.println("Fill your tank with gasoline!");
                }
                break;

            case "Gas":
                if (litersOfFuel >= 25) {
                    System.out.println("You have enough gas.");
                } else {
                    System.out.println("Fill your tank with gas!");
                }
                break;

            default:
                System.out.println("Invalid fuel!");
                break;

        }


    }

}
