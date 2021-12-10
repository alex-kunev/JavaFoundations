package maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


//Read a list of real numbers and print them in ascending order
//along with their number of occurrences
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = sc.nextLine().split(" ");

        Map<Integer, Integer> numbersMap = new TreeMap<>();
        for (String item: items) {
            int number = Integer.parseInt(item);

            Integer occurences = numbersMap.get(number);
            if (occurences == null) {
                numbersMap.put(number, 1);
            } else {
                numbersMap.put(number, occurences+1);
            }

            for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()
            ) {
                System.out.printf("%d -> %d %n", entry.getKey(), entry.getValue());
            }

        }
    }
}
