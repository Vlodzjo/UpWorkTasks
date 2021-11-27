import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        averageIntArray();
    }

    public static void averageIntArray() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter next whole number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        double average = Arrays.stream(array).average().getAsDouble();
        System.out.println("Average: " + average);
        for (int i = 0; i < array.length; i++) {
            int ifGreater = array[i];
            if (ifGreater > average) {
                System.out.println(ifGreater);
            }
        }
    }
}
