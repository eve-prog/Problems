import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        //40 % of the wine-making crop is allocated from a vineyard of X square meters.
        //From 1 square meter vineyard are earn Y kilos of grapes.
        //For 1 liter of wine are needed 2.5 kg grapes.
        //The desired amount of wine for sale is Z liters.
        //Write a program that calculates how much wine can be produced and whether this quantity is enough.
        //If sufficient, the remainder is divided equally between the workers of the vineyard.
        //Output
        //The following should be printed on the console:
        //If the wine produced is less than necessary:
        //"It will be a tough winter! More {unattainable wine} liters wine needed."
        //The result must be rounded to a lower integer
        //If the wine produced is more than or equal to necessary:
        //"Good harvest this year! Total wine: {Total wine} liters."
        //The result must be rounded to a lower integer
        //"{remaining wine} liters left -> {wine for 1 worker} liters per person."
        //Both results must be rounded to the higher integer, 650, 2, 175, 3

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //x sq m is the vineyard
        double y = scanner.nextDouble(); //grapes for 1 sq m
        int z = scanner.nextInt(); //need liters of wine
        int workers = scanner.nextInt(); //Number of workers

        double grape = x * y;
        double wine = grape / 2.5 * 0.4;

        if (wine >= z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            double left = wine - z;
            double winePerWorker = left/ workers;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil (left), Math.ceil(winePerWorker));
        }else{
            double neededWine = z - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededWine));
        }


    }
}
