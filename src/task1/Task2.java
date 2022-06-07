package src.task1;

import java.util.Scanner;

public class Task2 {
    void task2Answer() {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String longWord = "", shortWord = str;
        for (String s : str.split(" ")) {
            if (s.length() > longWord.length()) {
                longWord = s;
            }
            if (s.length() < shortWord.length()) {
                shortWord = s;
            }
        }
        System.out.println("The most LONG word: " + longWord);
        System.out.println("The most SHORT word: " + shortWord);
    }
}

