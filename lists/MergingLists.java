package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersA = parseNumbers(sc.nextLine());
        List<Integer> numbersB = parseNumbers(sc.nextLine());

        for (int item : numbersA) {
            System.out.println(item);
        }
        
    }

    private static List<Integer> parseNumbers(String values) {
        List<Integer> numbers = new ArrayList<>();
        String[] splitValues = values.split(" ");
        for (String item : splitValues) {
            numbers.add(Integer.parseInt(item));
        }
        return numbers;
    }
}
