import java.util.Scanner;

public class SummerOutfit {
    /*
    Description
It's summer with changeable weather and Victor needs your help.
Write a program that recommends Victor which clothes to choose according to the part of day and degrees (Celsius).
Your friend has different plans for every part of the day with different outfits – check the table below.
Part of Day / Degrees
Morning
Afternoon
Evening
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        if (degrees >= 10 && degrees <= 18) {
            if (partOfDay.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
            } else if (partOfDay.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            } else if (partOfDay.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (partOfDay.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            } else if (partOfDay.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
            } else if (partOfDay.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        } else if (degrees >= 25) {
            if (partOfDay.equals("Morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
            } else if (partOfDay.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degrees);
            } else if (partOfDay.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        }
    }

}
