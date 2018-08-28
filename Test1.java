package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) {
        File file = new File("File.txt");
        String text = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
           String string;
            while ((string = br.readLine()) != null) {
                text = text.concat(string);
            }

        }
        catch (IOException e){
            System.out.println("File is missing");
        }


        String[] tx = text.split("\\;|\\.|\\,|\\/|\\-|\\:|\\s");


        for (String st : tx){
            if(!st.isEmpty())
                System.out.println(st);
        }
    }
}
