/*  
    Name: Trevor Sherrill
    Student ID: L00652214 
    Email: tsherrill1@una.edu
    Course Information: CIS 315-01
    Program Source File Name:  <GuessingGame.java>
    Programming Assignment:  Project #3
    Program Description: 
    - Guessing Game. I’m thinking of a number between 1 and 20. 
    What is the number and how many tries did it take to get the 
    right answer. 

    References: 
    - (none)
    
    Due Date: Nov. 11th @ 11:59PM	 	 
 
    In keeping with the honor code policies of the University of University of North Alabama, 
    the School of Business, and the Department of Computer Science, I affirm that I have neither 
    given nor received on this programming assignment. This assignment represents my individual, 
    original effort.

    Trevor Sherrill
         
*/ 
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void println(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        // Object(s)
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Variable(s)
        int randomNum = rand.nextInt(20) + 1;
        int sentinel = -1;
        int guess = 0;
        int totalGuesses = 0;
        boolean won = false;

        // Introduction
        println("Welcome to the Guessing Game!");
        println("----------------------------");

        // Loop
        while (guess != sentinel) {

            print("I'm thinking of a number between 1 and 20. ");
            print("Enter -1 if you would like to quit (at any time).\n");

            print("What is your guess?: ");
            guess = input.nextInt();

            // Sentinel (quit)
            if (guess == sentinel) {
                break;
            }

            // Total guesses incr.
            totalGuesses++;
            
            // Determine next move
            if (guess > randomNum) {
                println("That is too high.");
            }
            else if (guess < randomNum) {
                println("That is too low.");
            }
            else if (guess == randomNum) {
                won = true;
                break;
            }

        }

        println("");

        // Game Results
        if (won == true) {
            println("You nailed it!");
        } else {
            println("The number was " + randomNum + ".");
        }

        if (totalGuesses == 0) {
            println("You didnt even try! Boo!");
        }
        else if (totalGuesses > 0) {
            println("Your number of tries was " + totalGuesses + ".");
        }

        println("Game over! \nGoodbye.");

        input.close();

    }

}
