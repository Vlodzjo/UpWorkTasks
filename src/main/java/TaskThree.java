import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int maxNumber = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter whole number: ");
            int number = scanner.nextInt();
            maxNumber = getMax(maxNumber, number);
        }
        System.out.println("Highest: " + maxNumber);
        getPizzaInfo();
    }

    public static int getMax(int oneNumber, int twoNumber) {
        if (oneNumber > twoNumber) {
            return oneNumber;
        } else {
            return twoNumber;
        }
    }

    public static double calcPizzaCharge(int size, int meatToppings, int nonMeatToppings, int countPizzaOrder) {
        double smallPizza = 6.5;
        double mediumPizza = 9.5;
        double largePizza = 11.5;
        double meatTopping = 3.5;
        double nonMeatTopping = 1.5;
        double result = 0.0d;
        switch (size) {
            case 1: {
                result += smallPizza;
                break;
            }
            case 2: {
                result += mediumPizza;
                break;
            }
            case 3: {
                result += largePizza;
                break;
            }
        }
        result += meatToppings * meatTopping;
        result += nonMeatToppings * nonMeatTopping;
        result *= countPizzaOrder;
        return result;
    }

    public static void getPizzaInfo() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter pizza size (1 small, 2 medium, 3 large): ");
        int pizzaSize = scanner.nextInt();
        System.out.print("Enter number meat toppings: ");
        int meatToppings = scanner.nextInt();
        System.out.print("Enter number or non-meat toppings: ");
        int nonMeatToppings = scanner.nextInt();
        System.out.print("Enter number of pizzas ordered: ");
        int pizzaOrdered = scanner.nextInt();

        System.out.print("Pizza Total: $" + calcPizzaCharge(
                pizzaSize, meatToppings, nonMeatToppings, pizzaOrdered));
    }
}
