package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    static String readTextFile(String fName) throws IOException,
            IllegalArgumentException{
        // IllegalArgumentException doesn't need to be handled
        BufferedReader reader =
                new BufferedReader(new FileReader(fName));
        StringBuilder result = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null)
                result.append(line + System.lineSeparator());
            //System.lineSeparator() is better than /n for 'new line'
        } finally {
            reader.close();
        }
        return result.toString();
    }

    //in 'main' method, the IOException should be handled!
    public static void main(String[] args) throws IOException {
//        String fileName = "./src/com/company/FileReaderExample_NEW.java";
//        String sourceCode = readTextFile(fileName);
//        System.out.println(sourceCode);

        FileWriter file = new FileWriter("text.txt");
        file.write("Some stuff goes in here\n");
        file.write("Another sentence\n");
        file.close();
    }
}
