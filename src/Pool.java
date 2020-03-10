import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {
        /*
A pool with volume V has two pipes that fill it.
Every pipe has certain flow (liters water that going through a single pipe per hour).
The worker turns on the pipes at the same time and goes out for N hours.
Write a program that shows the condition of the pool at the moment the worker comes back.
Input
Four lines of input:
V - The volume of the pool in liters - integer in range [1…10000]
P1 - flow of the first pipe per hour - integer in range [1…5000]
P2 - flow of the second pipe per hour - integer in range [1…5000]
H - hours the worker is missing - float-pointing number in range [1.0…24.00]
Output
Print on the console one of both possibilities:
How far the pool has been filled and which pipe how much contributed in percentage
"The pool is {occupancy of the pool in percent}% full. Pipe 1: {percent water from the first pipe}%.
Pipe 2: {percent water from the second pipe}%." 1000, 100, 120, 3
If the pool is overflowing – how many liters are overflowed for the given time
"For {hours pipes are filling the pool} hours the pool overflows with {liters water overflow} liters."
All numbers in the output should be formatted to 2nd digit after the decimal point. 100, 100, 100, 2.5
         */
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        double h = scanner.nextDouble();

        double waterP1 = p1 * h;
        double waterP2 = p2 * h;
        double fill = waterP1 + waterP2;

        if (fill <= v) {
            double occupancy = fill / v * 100;
            double percentWater1 = waterP1 / fill * 100;
            double percentWater2 = waterP2 / fill * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%.Pipe 2: %.2f%%.", occupancy, percentWater1, percentWater2);
        } else if (fill > v) {
            double p1Fill = p1 * h;
            double p2Fill = p2 * h;
            double remain = (p1Fill + p2Fill) - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, remain);

        }

    }
}
