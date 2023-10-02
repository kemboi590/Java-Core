package tech.kemboi;

import java.util.Random;
import java.util.Scanner;

public class GuessMeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess me game");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello and welcome " + userName);

        System.out.println("Shall we begin the game?");
        System.out.println("\t 1. Yes");
        System.out.println("\t 2. No");

        int beginAnswer = scanner.nextInt();

        while(beginAnswer !=1){
            System.out.println("Shall we begin the game?");
            System.out.println("\t 1. Yes");
            System.out.println("\t 2. No");

             beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x =  random.nextInt(20) + 1;
        System.out.println("Please geues a number: ");
        int userInput = scanner.nextInt();

        int timeTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timeTried++;
            if (timeTried<5){
                if(userInput == x ){
                    hasWon =  true;
                    shouldFinish = true;
                } else if (userInput>x) {
                    System.out.println("Guess lower");
                    userInput = scanner.nextInt();

                }else{
                    System.out.println("Guess higher");
                    userInput = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }
        if (hasWon){
            System.out.println("Congratulations🥳," + userName +  " you tried it in " + timeTried + " guesses");
        }else {
            System.out.println("Game over🤨!");
            System.out.println("The answer was: " + x);
        }


    }
}
