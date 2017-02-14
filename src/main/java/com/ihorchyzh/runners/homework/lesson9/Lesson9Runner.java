package com.ihorchyzh.runners.homework.lesson9;

import com.ihorchyzh.app.homework.lesson9.Lesson9;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/14/17.
 */
public class Lesson9Runner {

    public static void main(String[] args) {

        do {
            Lesson9 lesson9 = new Lesson9();
            Scanner scanner = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder
                    .append("\nHi! Here is an app that can verify if entered word is palindrome!")
                    .append("\nType some word and press Enter in the end.")
                    .append("\n\nBut if you want to quit you should type \"exit\" and press Enter"));
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                System.exit(0);
            }
            System.out.println("Now choose one of the 5 methods to verify.");
            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        System.out.println(lesson9.palindromeVer1(userInput));
                        break;
                    case 2:
                        char[] charArray = userInput.toCharArray();
                        System.out.println(lesson9.palindromeVer2(charArray));
                        break;
                    case 3:
                        System.out.println(lesson9.palindromeVer3(userInput));
                        break;
                    case 4:
                        System.out.println(lesson9.palindromeVer4(userInput));
                        break;
                    case 5:
                        System.out.println(lesson9.palindromeVer5(userInput));
                        break;
                    default:
                        System.out.println("Wrong input. Try number from 1 to 5!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Only numbers required! Try again.");
            }
        } while (true);
    }
}