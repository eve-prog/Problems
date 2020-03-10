import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        //Write a program that prints the type of an animal according to its name.
        //
        //Input / Output
        //dog -> mammal
        //
        //crocodile, tortoise, snake -> reptile
        //
        //others -> unknown

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("dog")){
            System.out.println("mammal");
        }else if(type.equals("crocodile")){
            System.out.println("reptile");
        }else if(type.equals("tortoise")){
            System.out.println("reptile");
        }else if(type.equals("snake")){
            System.out.println("reptile");
        }else{
            System.out.println("unknown");
        }
    }
}
