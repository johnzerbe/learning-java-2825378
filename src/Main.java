package src;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the capital of Argentina?";
        String choiceOne = "santiago";
        String choiceTwo = "buenos aires";
        String choiceThree = "sao paulo";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Is it " + choiceOne + ", " + choiceTwo +
         ", or " + choiceThree + "?");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String inputtedAnswer = scanner.nextLine();

        // If the user's input matches the correctAnswer...
        if(correctAnswer.equals(inputtedAnswer.toLowerCase())) {
        // then the user is correct and we want to print out a congrats message to the user.
        System.out.println("YOU ARE CORRECT!");
        // If the user's input does not match the correctAnswer...
        } else {
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("That is incorrect. The correct answer was Buenos Aires");
        }

    }

}
