

import java.util.Random;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Please, enter Your name: ");
        String name = reader.nextLine();
        System.out.println("Welcome " + name + "!, Remember to Have Fun While Learning!");

        Random random = new Random();
        int randomNum1 = random.nextInt(1, 15);
        int randomNum2 = random.nextInt(1, 10);
        int result = 0;

        //Addtion
        System.out.println("What is the sum of " + randomNum1 + " and " + randomNum2);
        int userSum = reader.nextInt();
        int sum = randomNum1 + randomNum2;
        if(userSum == sum) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer.  The correct answer is " + sum);
        }


        //Subtraction
        System.out.println("What is the difference of " + randomNum1 + " and " + randomNum2);
        int userSub = reader.nextInt();
        int sub = randomNum1 - randomNum2;
        if(userSub == sub) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer ! The correct answer is " + sub);
        }


        //Multiplication
        System.out.println("What is the multiple of " + randomNum1 + " and " + randomNum2);
        int userMultiply = reader.nextInt();
        int multiply = randomNum1 * randomNum2;
        if(userMultiply == multiply) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer! The correct answer is " + multiply);
        }


        //Division
        System.out.println("What is the division of " + randomNum1 + " and " + randomNum2);
        int userDiv = reader.nextInt();
        int div = randomNum1 / randomNum2;
        if(userDiv == div) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer! the correct answer is " + div);
        }


        //Modulus
        int mod = randomNum1 % randomNum2;
        System.out.println("What is the modulus of " + randomNum1 + " and " + randomNum2);
        int userMod = reader.nextInt();
        if(userMod == mod) {
            System.out.println("Correct answer!");
            result++;
        } else {
            System.out.println("Wrong answer!  The correct answer is " + mod);
        }





        // final score
        System.out.println( name + "Your Final Score: is " + result + " out of 5 questions. Keep Practicing");

        reader.close();
    }
}
