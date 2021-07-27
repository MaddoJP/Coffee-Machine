package machine;

import java.util.Scanner;


public class CoffeeMachine {

    public static final Scanner scanString = new Scanner(System.in);
    public static final Scanner scanInt = new Scanner(System.in);

    public final static int neededWater = 200;
    public final static int neededMilk = 50;
    public final static int neededCoffee = 15;

    public static int mlWater = 400;
    public static int mlMilk = 540;
    public static int gCoffee = 120;
    public static int disposableCups = 9;
    public static int dollar = 550;

    public static int fillWater;
    public static int fillMilk;
    public static int fillCoffeeBeans;
    public static int fillDisposableCups;

    public static void main(String[] args) {

        setup();
        action();

    }

    private static void action() {
        System.out.println("Write action (buy, fill, take): ");
        String action = scanString.nextLine();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            default:
                break;
        }


    }


    private static void take() {
        System.out.printf("I gave you $%d\n", dollar);
        System.out.println();
        dollar -= dollar;
        setup();

    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        fillWater = scanInt.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        fillMilk = scanInt.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        fillCoffeeBeans = scanInt.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        fillDisposableCups = scanInt.nextInt();
        System.out.println();
        System.out.println("The coffee machine has:\n");
        System.out.printf("%d ml of water\n", mlWater + fillWater);
        System.out.printf("%d ml of milf\n", mlMilk + fillMilk);
        System.out.printf("%d g of coffee beans\n", gCoffee + fillCoffeeBeans);
        System.out.printf("%d disposable cups\n", disposableCups + fillDisposableCups);
        System.out.printf("$%d of money\n", dollar);
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String buyAction = scanString.next();
        if (buyAction.equals("1")) {
            mlWater -= 250;
            gCoffee -= 16;
            dollar += 4;
            disposableCups--;
        } else if (buyAction.equals("2")) {
            mlWater -= 350;
            mlMilk -= 75;
            gCoffee -= 20;
            dollar += 7;
            disposableCups--;
        } else if (buyAction.equals("3")) {
            mlWater -= 200;
            mlMilk -= 100;
            gCoffee -= 12;
            dollar += 6;
            disposableCups--;
        } else if (buyAction.equals("back")) {
            action();
        }
    }

    private static void setup() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", mlWater);
        System.out.printf("%d ml of milf\n", mlMilk);
        System.out.printf("%d g of coffee beans\n", gCoffee);
        System.out.printf("%d disposable cups\n", disposableCups);
        System.out.printf("$%d of money\n", dollar);
        System.out.println();

    }
}
