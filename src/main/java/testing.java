

import java.util.Random;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please, enter Your name: ");
        String name = userInput.nextLine();
        System.out.println("Welcome " + name + "!, Remember to Have Fun While Learning!");



        Random random = new Random();
        int question;
        int answer;
        int totalscore = 0;


        for (int i = 0; i < 5; i++) {
            question = random.nextInt(5) + 1;


            switch (question) {
                case 1:
                    System.out.println("What is 2 + 2?");
                    answer = 4;
                    break;
                case 2:
                    System.out.println("What is the square root of 25?");
                    answer = 5;
                    break;
                case 3:
                    System.out.println("How many sides does a square have?");
                    answer = 4;
                    break;
                case 4:
                    System.out.println("What is 3 * 7?");
                    answer = 21;
                    break;
                case 5:
                    System.out.println("What is 4-1?");
                    answer = 3;
                    break;
                default:
                    System.out.println("Not a valid question");
                    return;
            }


            System.out.print("Your Answer: ");
            answer = userInput.nextInt();


            if (answer == answer) {
                System.out.println("Correct!");
                totalscore++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answer);
            }


        }

        // Display the final score
        System.out.println("Your Final Score: " + totalscore);

        userInput.close();
    }
}
