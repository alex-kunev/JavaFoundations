package methods;

import java.util.Scanner;

public class repeatStringEx {
    //Write a method that receives a string and a repeat count n 
    //The method should return a new string 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.nextLine();
        int repeat = Integer.parseInt(sc.nextLine());
        System.out.println(repeatString(code,repeat));
        }

    private static String repeatString(String code, int repeat) {
        String cypher = "";
        for (int i = 0; i < repeat; i++) {
            cypher += code;
        }
        return cypher;
    }

}
