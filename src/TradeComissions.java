import java.util.Scanner;

public class TradeComissions {
    /*
    A company pays the following commissions to its employees according to the city they work in and the amount of sales:
Write a console program that reads as input the name of a city and the amount of sales and calculates the value of the trade commission.
Input
Read from the console two lines:
Name of a city - String
Amount of sales - floating-point number
Output
Print on the console the calculated value of trade commission.
The result should be formatted to the second decimal point.
If you receive invalid name of city or amount of sales (negative number), print "error".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double amountOfSales = scanner.nextDouble();

        double tradeComision = 0;
        switch (city) {
            case "London":
                if (amountOfSales >= 0 && amountOfSales <= 500) {
                    tradeComision = 5 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales >= 501 & amountOfSales <= 1000) {
                    tradeComision = 7 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales >= 1001 & amountOfSales <= 10000) {
                    tradeComision = 8 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales > 10000) {
                    tradeComision = 12 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales < 0)
                    System.out.println("error");
                break;

            case "New York":
                if (amountOfSales >= 0 && amountOfSales <= 500) {
                    tradeComision = 4.5 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales >= 501 & amountOfSales <= 1000) {
                    tradeComision = 7.5 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales >= 1001 & amountOfSales <= 10000) {
                    tradeComision = 10 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales > 10000) {
                    tradeComision = 13 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales < 0)
                    System.out.println("error");
                break;
            case "Sydney":
                if (amountOfSales >= 0 && amountOfSales <= 500) {
                    tradeComision = 5.5 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales >= 501 & amountOfSales <= 1000) {
                    tradeComision = 8 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales >= 1001 & amountOfSales <= 10000) {
                    tradeComision = 12 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales > 10000) {
                    tradeComision = 14.5 * amountOfSales / 100;
                    System.out.printf("%.2f", tradeComision);
                } else if (amountOfSales < 0)
                    System.out.println("error");
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
