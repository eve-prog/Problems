import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        /*
Write a program to check for fruit or vegetable:
Read a single input line: an item from the greengrocery
Fruits: banana, apple, kiwi, cherry, lemon, grapes
Vegetables: cucumber, pepper, carrot, onion
Print: "vegetable", "fruit" or "unknown"

Eample
Input
lemon

Output
fruit

Input
carrot

Output
vegetable
         */
        Scanner scanner = new Scanner(System.in);
        String item= scanner.nextLine();

        if (item.equals("cucumber") || item.equals("pepper") || item.equals("carrot") || item.equals("onion")){
            System.out.println("vegetable");
        }else if(item.equals("banana") || item.equals("apple") || item.equals("kiwi") || item.equals("cherry")
                || item.equals("lemon")|| item.equals("grapes") ){
            System.out.println("fruit");
        }else{
            System.out.println("Unknown");
        }
    }
}
