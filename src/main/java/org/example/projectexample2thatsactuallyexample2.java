/*
 *UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 RAYME PERSAD
 */


package org.example;
import java.util.Scanner;

public class projectexample2thatsactuallyexample2 {
    /*Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.
*/

        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string?");
        String s = input.nextLine();

    String total = "";

        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);

        }//close the for loop here

        System.out.println("Total amount of characters: " + s.length() + " - " + s);


    }
