package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //this is the user input
        System.out.print("Enter width: "); //user sees this displayed in console
        int width = input.nextInt(); // user inputs number
        System.out.print("Enter height: ");
        int height = input.nextInt();
        System.out.print("Enter desired character for outline: ");
        String character = input.next();
        printRectangle(width, height, character);  //invoking private function with user input values
    }


    private static void printRectangle(int width, int height, String character) {
        for (int j = 1; j <= width; j++) {
            System.out.print(character + " ");// 1st horizontal line. Add space between characters for more symmetrical display in console
        }
        System.out.println(); //goes to next line
        for (int i = 1; i <= height - 2; i++) { // subtract 2 vertical characters to account for 1st and last horizontal line
            System.out.print(character);// characters in next line = characters of 1st vertical line.
            for (int j = 1; j <= (width * 2) - 3; j++) { //print spaces double times the width -3 to
                // account for spaces and 1st and last characters in 1st and last horizontal lines
                System.out.print(" ");
            }
            System.out.println(character); // print character of 2nd vertical line
        }
        for (int j = 1; j <= width; j++) {
            System.out.print(character + " "); //last line. Add space between characters for more symmetrical display
        }
    }
}
