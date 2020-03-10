import java.util.Scanner;

public class CoffeShop {

    //Write a program to calculate the drink price in a coffee shop:
    //Read a drink: either "coffee" or "tea"
    //Read an extra: either "sugar" or "no"
    //Print the price in format "Final price: ${price}"
    //The price should be formatted to 2nd digit after the decimal point
    //Prices:
    //Coffee price: 1.00
    //Tea price: 0.60
    //Sugar price: 0.40
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;
        String drink = scanner.nextLine();
        if (drink.equals("coffee")) {
            price = 1.00;

        } else if (drink.equals("tea")) {
            price = 0.60;

        }

        String extra = scanner.nextLine();
        if (extra.equals("sugar")) {
            price += 0.40;

        }
        System.out.printf("Final price: $%.2f", price);
    }

}


