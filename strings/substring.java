package strings;

import java.util.Scanner;

public class substring {
    //You are given a word to remove and a text
    //Remove all substrings that are equal to the remove word
    //"runruntextrun" -> text
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String text = sc.nextLine();

        if(text.contains(key)) {
            int index = text.indexOf(key);
            int occurence = 0;
            while (index != -1 ) {
                text = text.replace(key, "");
                index = text.indexOf(key);
            }
            System.out.println(text);
        }
    }
}
