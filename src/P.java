import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int P1 = sc.nextInt();
        int P2 = sc.nextInt();
        double H = sc.nextDouble();

        double P1ingivenhours = P1 * H;
        double P2ingivenhours = P2 * H;
        double totalfill = P1ingivenhours + P2ingivenhours;

        if (totalfill <= V) {
            double totalfillpercent = (totalfill/V) *100;
            double P1fillinpercent = (P1ingivenhours / totalfill) * 100;
            double P2fillinpercent = (P2ingivenhours / totalfill) *100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalfillpercent, P1fillinpercent, P2fillinpercent);}
        else if (totalfill > V) {
            double P1fill = P1 * H;
            double P2fill = P2 * H;
            double remain = (P1fill + P2fill) - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters." , H , remain);
        }
    }
}


