import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;
import java.util.Scanner;

public class DiceRollGame {
    public static void main(String[] args) {
        System.out.println("Welcome! Let's Play Roll Dice! ");
        int score = 0;

        int total = 0;
        String input2;
        Scanner input = new Scanner(System.in);


        do {

            Random rnd = new Random();
            int num1 = 1 + rnd.nextInt(6);
            int num2 = 1 + rnd.nextInt(6);

            System.out.println("Your rolls " + num1 + " & " + num2);

            //  int score = num1 + num2;
            if (num1 == 1 && num2 == 1) {
                score += 25;
                System.out.println("Score: " +score);

            }
            if (num1 == 1 || num2 == 1) {
                score += 0;
                System.out.println("Score: " + score);
            } else {
            score += num1 + num2;
                System.out.println("Score: " + score);
            }


            System.out.println("Roll again? ");
            input2 = input.next();



        }while(score<= 100 && !input2.equalsIgnoreCase("no"));

        if (score >=100){
            System.out.println("You have scored over 100");
        }
        System.out.println("Thank you for playing!");
    }
}
