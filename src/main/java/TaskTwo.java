import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        List<Integer> array = TaskFour.getIntArray(scanner.nextInt());
        double average = averageIntArray(array);
        System.out.println("Average: " + average);
        for (int greater : array) {
            if (greater > average) {
                System.out.println(greater);
            }
        }
    }

    public static double averageIntArray(List<Integer> array) {
        double average = array.stream().mapToDouble(number -> number).sum();
        average /= array.size();
        return average;
    }
}
