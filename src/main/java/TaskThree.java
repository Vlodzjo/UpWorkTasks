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
        return Math.max(oneNumber, twoNumber);
    }

    public static double calcPizzaCharge(int pizzaCode, int meatToppings, int nonMeatToppings, int countPizzaOrder) {
        PizzaType pizzaType = PizzaType.fromCode(pizzaCode);
        Pizza pizza = null;
        switch (pizzaType) {
            case LARGE:
                pizza = new LargePizza();
                break;
            case MEDIUM:
                pizza = new MediumPizza();
                break;
            case SMALL:
                pizza = new SmallPizza();
                break;
        }
        return pizza.calculatePizzaPrice(meatToppings, nonMeatToppings, countPizzaOrder);
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

        System.out.println("Pizza Total: $" + calcPizzaCharge(
                pizzaSize, meatToppings, nonMeatToppings, pizzaOrdered));
    }
}
