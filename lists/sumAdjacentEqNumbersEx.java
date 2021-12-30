package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqNumbersEx {
    //Write a program to sum all adjacent equal numbers in a list ofdecimal numbers, starting from left to right
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = parseNumbers(sc.nextLine());

        for (int item : numbers) {
            System.out.println(item);
        }
        
        //Stream API example
        String scLine = sc.nextLine();
        List<String> items = Arrays.stream(scLine.split(" ")).collect(Collectors.toList());
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
                nums.add(Integer.parseInt(items.get(i)));
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
