import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        ArrayList<Integer> array = TaskFour.getIntArray(scanner.nextInt());
        averageIntArray(array);
    }

    public static void averageIntArray(ArrayList<Integer> array) {
        double average = array.stream().mapToDouble(number -> number).sum();
        average /= array.size();
        System.out.println("Average: " + average);
        for (int greater : array) {
            if (greater > average) {
                System.out.println(greater);
            }
        }
    }
}
