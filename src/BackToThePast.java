import java.util.Scanner;

public class BackToThePast {
    /*
    Josh is 18 years old and receives a legacy that consists of X amount of money and time machine.
He decided to return until 1800, but he did not know if the money would suffice to live without working.
Write a program that calculates whether Josh will have enough money to not have to work until a certain year.
Assuming that for every even (1800, 1802, etc.) year will spend 12 000 dollars.
For each odd (1801, 1803, etc.) will spend 12 000 + 50 * [the years age in a given year].
Input
The input is read from the console and contains exactly 2 lines:
Legacy money – real number in range [1.00... 1,000,000.00]
Year to be lived (inclusive) – integer in range [1801... 1900]
Output
Print on the console a single line. The amount must be formatted to two decimal digits:
If the money are enough:
"Yes! He will live a carefree life and will have {N} dollars left." – where N are the money that will remain
If the money are NOT enough:
"He will need {М} dollars to survive." - where M are money he needs
1800 -> even year;
Josh spends 12000 dollars
50000 – 12000 = 38000 dollars remain
1801 -> odd year
he spends 12000 + 19 * 50 = 12000 + 950 = 12950 dollars
38000 – 12950 = 25050 dollars remain
1802 -> even year
he spends 12000 dollars
25050 – 12000 = 13050 dollars remain
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double legacyMoney = Double.parseDouble(scanner.nextLine());
        int yearToBeLived = Integer.parseInt(scanner.nextLine());

        double costs = 0;
        int age = 18;
        for (int i = 1800; i <= yearToBeLived; i++) {
            if (i % 2 == 0) {
                costs = costs + 12000;
            } else {
                costs = costs + 12000 + 50 * age;
            }
            age++;
        }
        if (legacyMoney >= costs){
            double left = legacyMoney - costs;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", left );
        }else{
            double need = costs - legacyMoney;
            System.out.printf("He will need %.2f dollars to survive.", need);
        }

    }

}
