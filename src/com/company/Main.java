package com.company;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;



public class Main {

    public static void main(String[] args) {

        //choose a random element
        Random rnd = new Random();
        char randomElement = (char)(rnd.nextInt((90 - 65) + 1) + 65);

        //String alphabet[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"};
        //char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
        int triesCount = 0;
        char userLetter;
        String inputString = "";

        System.out.println("Game Guess the letter");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the letter: ");


     do {
         triesCount++;

         inputString = scanner.next();
         userLetter = inputString.charAt(0);

         // check a length of string
         if(inputString.length() > 1) {
             System.out.println("Error!");
             continue;
         }
         userLetter = Character.toUpperCase(userLetter);

         if ((int)userLetter < 65 || (int)userLetter > 90)
         {
             System.out.println("Please to get acquainted with the rule of the game, it's not a symbol of Latin alphabet");
             System.out.println("Enter one more times");
            continue;

         }


         if (userLetter == randomElement)
         {
             System.out.println("YOU WON!!!");
         } else if ((int)userLetter > (int)randomElement) {
             System.out.println("Too high!");
         } else if ((int)userLetter < (int)randomElement) {
             System.out.println("Too low!");
         }


     } while (userLetter != randomElement);

        System.out.println("Count of trys:" + triesCount);


}

}
