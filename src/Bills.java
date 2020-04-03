import java.util.Scanner;

public class Bills {
    /*
    Write a program to calculate the average cost per month for a family over a period of time.
    For each month the costs are as follows:
For electricity - every month the bill is different and will be read from the console
For water - 20$
For Internet - 15$
For others - sum the bills for electricity, water and Internet and add 20%
For each bill, you need to calculate how much total is paid for all months.
Input
The input is read from the console:
The months for which the average cost is searched – integer in range [1... 100]
For each month – the bill for electricity – a real number in range [1.00... 1000.00]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double water = 20;
        double internet = 15;
        double others = 0;
        double totalElectricity = 0;
        for (int i = 1; i <= months; i++) {
            double electricBillPerMonth = Double.parseDouble(scanner.nextLine());
            totalElectricity += electricBillPerMonth;
            water = months * 20;
            internet = months * 15;
            others = totalElectricity + water + internet + 0.2 * (totalElectricity + water + internet);
        }
        double total = totalElectricity + water + internet + others;
        double averageBillsPerMonth = total / months;
        System.out.printf("Electricity: %.2f $\n", totalElectricity);
        System.out.printf("Water: %.2f $\n", water);
        System.out.printf("Internet: %.2f $\n ", internet);
        System.out.printf("Other: %.2f $\n", others);
        System.out.printf("Average: %.2f $\n", averageBillsPerMonth);
    }
}
