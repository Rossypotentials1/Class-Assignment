

import java.util.Random;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Please, enter Your name: ");
        String name = reader.nextLine();
        System.out.println("Hello " + name + "!,Welcome to your Maths Assessment, Remember to Have Fun While Learning!");

        Random random = new Random();
        int randomNum1 = random.nextInt(1, 15);
        int randomNum2 = random.nextInt(1, 10);
        int result = 0;

        //Addtion
        randomNum1 = random.nextInt(1, 25);
        randomNum2 = random.nextInt(1, 10);
        System.out.println("What is the sum of " + randomNum1 + " and " + randomNum2);
        int userSum = reader.nextInt();
        int sumAnswer = randomNum1 + randomNum2;
        if(userSum == sumAnswer) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer.  The correct answer is " + sumAnswer);
        }


        //Subtraction
        randomNum1 = random.nextInt(1, 25);
        randomNum2 = random.nextInt(1, 10);
        System.out.println("What is the difference of " + randomNum1 + " and " + randomNum2);
        int userSub = reader.nextInt();
        int subAnswer = randomNum1 - randomNum2;
        if(userSub == subAnswer) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer ! The correct answer is " + subAnswer);
        }


        //Multiplication
        randomNum1 = random.nextInt(1, 25);
        randomNum2 = random.nextInt(1, 10);
        System.out.println("What is the multiplication of " + randomNum1 + " and " + randomNum2);
        int userMultiply = reader.nextInt();
        int multAnswer = randomNum1 * randomNum2;
        if(userMultiply == multAnswer) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer! The correct answer is " + multAnswer);
        }


        //Division
        randomNum1 = random.nextInt(1, 25);
        randomNum2 = random.nextInt(1, 10);
        System.out.println("What is the division of " + randomNum1 + " and " + randomNum2);
        int userDiv = reader.nextInt();
        int divAnswer = randomNum1 / randomNum2;
        if(userDiv == divAnswer) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer! the correct answer is " + divAnswer);
        }


        //Modulus
        randomNum1 = random.nextInt(1, 25);
        randomNum2 = random.nextInt(1, 10);
        System.out.println("What is the modulus of " + randomNum1 + " and " + randomNum2);
        int userMod = reader.nextInt();
        int modAnswer = randomNum1 % randomNum2;
        if(userMod == modAnswer) {
            System.out.println("Correct answer!");
            result++;
        } else {
            System.out.println("Wrong answer!  The correct answer is " + modAnswer);
        }





        // final score
        System.out.println( name + " Your Final Score: is " + result + " out of 5 questions. Keep Practicing,Remember Practice makes perfect!");

        reader.close();
    }
}
