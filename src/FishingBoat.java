import java.util.Scanner;

public class FishingBoat {
    /*
Tony and his friends decided to rent a boat - the rent depends on the season and the number of fishermen.
The price on the basis of season:
Spring - 3000 $
Summer and autumn - 4200 $
Winter - 2600 $
The price on the basis of number of fishermen uses discount:
If the group is up to 6 people (inclusive) - 10% discount
If the group members are in range [7…11] - 15% discount
If the group is 12 or more people - 25% discount
The fishermen use another 5 % discount if they are even number except when it is NOT autumn – then they do NOT have additional discount.
Write a program to calculate whether the fishermen will gather enough money.
Input
The input is consists of exactly 3 lines:
The budget of the group - real number in range [1…8000]
Season - String : "Spring", "Summer", "Autumn", "Winter"
Number of fishermen - integer in range [4…18]
Output
Print on the console a single line:
If the budget IS enough: "Yes! You have {money left} dollars left."
If the budget IS NOT enough: "Not enough money! You need {money needed} dollars."
The prices should be formatted to the second decimal point.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int nrOfFisherman = Integer.parseInt(scanner.nextLine());

        switch (season) {
            case "Spring":
                if (nrOfFisherman <= 6) {
                    double money = 3000 - 0.1 * 3000;
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                } else if (nrOfFisherman >= 7 && nrOfFisherman <= 11) {
                    double money = 3000 - 0.15 * 3000;
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                } else if (nrOfFisherman > 12) {
                    double money = 3000 - 0.25 * 3000;
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                }
                break;

            case "Summer":
                if (nrOfFisherman <= 6) {
                    double money = 4200 - 0.1 * 4200;
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                } else if (nrOfFisherman >= 7 && nrOfFisherman <= 11) {
                    double money = 4200 - 0.15 * 4200;
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                } else if (nrOfFisherman > 12) {
                    double money = 4200 - 0.25 * 4200;
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                }
                break;

            case "Autumn":
                if (nrOfFisherman <= 6) {
                    double money;
                    if (nrOfFisherman % 2 != 0) {
                        money = 4200 - 0.1 * 4200;
                    } else {
                        money = 4200 - 0.15 * 4200;
                    }
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                } else if (nrOfFisherman >= 7 && nrOfFisherman <= 11) {
                    double money;
                    if (nrOfFisherman % 2 != 0) {
                        money = 4200 - 0.1 * 4200;
                    } else {
                        money = 4200 - 0.15 * 4200;
                    }
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                } else if (nrOfFisherman > 12) {
                    double money;
                    if (nrOfFisherman % 2 != 0) {
                        money = 4200 - 0.1 * 4200;
                    } else {
                        money = 4200 - 0.15 * 4200;
                    }
                    if (budget >= money) {
                        double moneyLeft = budget - money;
                        System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                    } else {
                        double moneyNeeded = money - budget;
                        System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                    }
                }
                    break;

                    case "Winter":
                        if (nrOfFisherman <= 6) {
                            double money = 2600 - 0.1 * 2600;
                            if (budget >= money) {
                                double moneyLeft = budget - money;
                                System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                            } else {
                                double moneyNeeded = money - budget;
                                System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                            }
                        } else if (nrOfFisherman >= 7 && nrOfFisherman <= 11) {
                            double money = 2600 - 0.15 * 2600;
                            if (budget >= money) {
                                double moneyLeft = budget - money;
                                System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                            } else {
                                double moneyNeeded = money - budget;
                                System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                            }
                        } else if (nrOfFisherman > 12) {
                            double money = 2600 - 0.25 * 2600;
                            if (budget >= money) {
                                double moneyLeft = budget - money;
                                System.out.printf("Yes! You have %.2f dollars left.", moneyLeft);
                            } else {
                                double moneyNeeded = money - budget;
                                System.out.printf("Not enough money! You need %.2f dollars.", moneyNeeded);
                            }
                        }
                        break;

                }
        }
    }



