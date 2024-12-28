//Noreen Akhtar
package theadditiongame;

import java.util.Random;
import java.util.Scanner;


public class TheAdditionGame
{

  
    public static void main(String[] args)
    {
         // Declare variables
        Scanner add = new Scanner(System.in);
        Random random = new Random();
        //Total problems player wants to play
        int totalProblems;  
        //Number of Correct Answers
        int correctAnswers = 0; 
        //Random Numbers
        int num1;              
        int num2;              
        int userAnswer;        
        int correctSum;        

        // Ask the user how many problems they want to attempt
        System.out.print("How many addition problems would you like to attempt? ");
        totalProblems = add.nextInt();
// Loop through the number of problems
        for (int i = 1; i <= totalProblems; i++) {
            
            // Generate two random integers between 10 and 50 inclusive
            num1 = random.nextInt(41) + 10; 
            num2 = random.nextInt(41) + 10; 

            // Prompt the user for the sum
            System.out.println("  " + num1); // First number
            System.out.println("+ " + num2); // Second number with plus sign
            System.out.println("-----");
            
            System.out.print(" ");
            userAnswer = add.nextInt();
            correctSum = num1 + num2;

            // Check if the user's answer is correct
            if (userAnswer == correctSum) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctSum + ".");
            }

            // Display the running total of correct answers
            
            System.out.println(correctAnswers + " correct out of " + i + " problems.\n");
        }

        // Final result
        System.out.println("Game over! You got " + correctAnswers + " out of " + totalProblems + " correct.");
        add.close();
    }
}
    
    

