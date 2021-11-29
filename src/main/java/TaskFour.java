import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        List<Integer> array = getIntArray(scanner.nextInt());
        for (Integer number : array) {
            System.out.println(number);
        }
    }

    public static ArrayList<Integer> getIntArray(int size) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter next whole number: ");
            int number = scanner.nextInt();
            array.add(number);
        }
        return array;
    }
}
