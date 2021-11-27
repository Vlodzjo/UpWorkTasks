import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        double[] order = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Add to order? (Y/N): ");
            String yesOrNo = scanner.next();
            if (yesOrNo.equals("Y")) {
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                double result = price * quantity;
                order[i] = result;
            } else {
                if (yesOrNo.equals("N")) {
                    result(order);
                    break;
                }
            }
            if (i == 9) {
                result(order);
            }
        }
    }

    private static void result(double[] order) {
        DecimalFormat d = new DecimalFormat("##.00");
        double sum = 0;
        int n = 0;
        for (double v : order) {
            sum += v;
        }
        System.out.println("Grand Total: $" + d.format(sum));
        for (double v : order) {
            ++n;
            if (v == 0.0d) {
                break;
            } else {
                System.out.println("Item " + n + " subtotal: $" + d.format(v));
            }
        }
    }
}
