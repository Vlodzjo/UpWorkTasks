import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        averageIntArray();
    }

    public static void averageIntArray() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        int arraySize = TaskFour.getIntArray();
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter next whole number: ");
            int number = scanner.nextInt();
            array.add(number);
        }
        double average = array.stream().mapToDouble(number -> number).sum();
        average /= arraySize;
        System.out.println("Average: " + average);
        for (double greater : array) {
            if (greater > average) {
                System.out.println(greater);
            }
        }
    }
}
