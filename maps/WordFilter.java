package maps;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = Arrays.stream(sc.nextLine().split(" "))
                .filter(w->w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word );
        }

    }
}
