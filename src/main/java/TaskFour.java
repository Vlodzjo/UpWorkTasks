import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter next whole number: ");
            int number = scanner.nextInt();
            array.add(number);
        }
        for (int number : array) {
            System.out.println(number);
        }
    }

}
