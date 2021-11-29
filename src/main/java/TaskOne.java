import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        List<Double> array = new ArrayList<>();

        while (true) {
            if (array.size() != 10) {
                System.out.print("Add to order? (Y/N): ");
                String yesOrNo = scanner.next();
                if (yesOrNo.equals("Y")) {
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    double result = price * quantity;
                    array.add(result);
                } else {
                    if (yesOrNo.equals("N")) {
                        result(array);
                        break;
                    }
                }
            } else {
                result(array);
                break;
            }
        }
    }

    private static void result(List<Double> order) {
        DecimalFormat d = new DecimalFormat("##.00");
        int n = 0;
        double sum = order.stream().mapToDouble(v -> v).sum();
        System.out.println("\nGrand Total: $" + d.format(sum));
        for (double v : order) {
            ++n;
            System.out.println("Item " + n + " subtotal: $" + d.format(v));
        }
    }
}
