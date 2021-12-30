import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapsListsTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> people = new TreeMap<>();

        people.put("George", 27);
        people.put("Peter", 35);
        people.put("Adda", 21);

        for(Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.printf("%s %d%n", entry.getKey(),entry.getValue() );

        }

        //Stream API - it handles collections of elements (Arrays, Maps), and
        // does operations on them for you
        int[] numbers = new int[]{1, 2, 3, 4};
        for (int number : numbers) {
            
        }


    }
}