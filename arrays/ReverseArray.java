package arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        

    }
}
