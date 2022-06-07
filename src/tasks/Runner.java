package src.tasks;

import java.util.Scanner;

import static src.tasks.Task1.*;

public class Runner {
    public static void main(String[] args) {
        // TODO Task1
        System.out.println("TASK 1:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();        //  xxxx-yyy-xxxx-yyy-xyxy     5552-abc-3434-ABC-1a2E
        System.out.println(part1(s));
        System.out.println(part2(s));
        System.out.println(part3(s).toLowerCase());
        System.out.println(part4(s).toUpperCase());
        System.out.println(part5(s));
        System.out.println(part6(s));
        System.out.println(part7(s));

        // TODO Task2
        System.out.println("\nTASK 2:");
        Task2 task2 = new Task2();         // fdfdfdf fdfd df dfdfdfd
        task2.task2Answer();

        // TODO Task5
        System.out.println("\nTASK 5:");
        Task5 task5 = new Task5();
        task5.task5Ansver();

    }
}
