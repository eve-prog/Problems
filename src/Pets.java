import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        /*
Write a program calculating the amount of kilograms food Martina's pets will eat for the time she is on adventure and checks if the food is enough.
Each animal eats certain amount food per day.
Input
Read five lines from the console:
number of days - an integer in range [1…5000]
left food in kilograms - an integer in range [0…100000]
food for the dog per day in kilograms - double in range [0.00…100.00]
food for the cat per day in kilograms - double in range [0.00…100.00]
food for the turtle per day in grams - double in range [0.00…10000.00]
Output
Print on the console a single line:
If the left food IS enough:  2,10,1,1,1200
"{kilograms remain} kilos of food left." The result should be rounded to the nearest lower integer
If the left food IS NOT enough: 5, 10, 2.1, 0.8, 321
"{kilograms needed} more kilos of food are needed.". The result should be rounded to the nearest higher integer
         */
        Scanner scanner = new Scanner(System.in);
        int nrOfDays = scanner.nextInt();
        int leftFoodInKg = scanner.nextInt();
        double foodDogPerDayInKg = scanner.nextDouble();
        double foodCatPerDayInKg = scanner.nextDouble();
        double foodTurtlePerDayInGrams = scanner.nextDouble();

        double amountOfFood = nrOfDays * foodDogPerDayInKg + nrOfDays * foodCatPerDayInKg + (nrOfDays * foodTurtlePerDayInGrams) / 1000;
        if (amountOfFood <= leftFoodInKg) {
            double kgRemain = leftFoodInKg - amountOfFood;
            System.out.println((int) Math.floor(kgRemain) + " kilos of food left.");
        } else {
            double kgNeeded = amountOfFood - leftFoodInKg;
            System.out.println((int) Math.ceil(kgNeeded) + " more kilos of food are needed.");
        }

    }
}

