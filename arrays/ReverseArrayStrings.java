package arrays;
import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        
        String[] strings = scanner.nextLine().split(" ");  

        for (int i = 0; i < strings.length / 2; i++) {
            int leftI = i;
            int rightI = strings.length - 1 - i;
            String emptyIndex;
            emptyIndex = strings[leftI];
            strings[leftI] = strings[rightI];
            strings[rightI] = emptyIndex;
            
        }

        System.out.println(String.join(" ", strings));
	}
}