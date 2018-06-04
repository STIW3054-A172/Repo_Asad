package com.mycompany.mavenproject1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class analysis {

     public static void tweetanalysis()throws IOException{

        int words;
        int lines;
        int chars;
        int m = 0;
        int m2 = 0;
        char c = ' ';
        
            FileInputStream FILE_IN = new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\testproject\\user_tweets.csv"); 
            Scanner fileinput = new Scanner(FILE_IN);
            words = 0;
            lines = 0;
            chars = 0;
            while (fileinput.hasNextLine()) {
                lines++;
                String line = fileinput.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ' ' || line.charAt(i) == '\n') {
                    } else {
                        chars++;
                    }
                }
                words += new StringTokenizer(line, " ,").countTokens();
            }   System.out.println("Number of lines: " + lines);
                System.out.println("Number of words: " + words);
                 System.out.println("Number of characters: " + chars);
        

    }

}
