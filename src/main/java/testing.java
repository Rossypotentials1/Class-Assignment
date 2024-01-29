

import java.util.Random;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please, enter Your name: ");
        String name = reader.nextLine();
        System.out.println("Welcome " + name + "!, Remember to Have Fun While Learning!");

        Random random = new Random();
        int randomNum1 = random.nextInt(1, 50);
        int randomNum2 = random.nextInt(1, 10);
        int result = 0;

        int sum = randomNum1 + randomNum2;
        System.out.println("What is the sum of " + randomNum1 + " and " + randomNum2);
        int userSum = reader.nextInt();

        if(userSum == sum) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer");
        }

        int sub = randomNum1 - randomNum2;
        System.out.println("What is the difference of " + randomNum1 + " and " + randomNum2);
        int userSub = reader.nextInt();

        if(userSub == sub) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer");
        }
        int mult = randomNum1 * randomNum2;
        System.out.println("What is the sum of " + randomNum1 + " and " + randomNum2);
        int userMult = reader.nextInt();

        if(userMult == mult) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer");
        }
        int div = randomNum1 / randomNum2;
        System.out.println("What is the division of " + randomNum1 + " and " + randomNum2);
        int userDiv = reader.nextInt();

        if(userDiv == div) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer");
        }
        int mod = randomNum1 % randomNum2;
        System.out.println("What is the modulus of " + randomNum1 + " and " + randomNum2);
        int userMod = reader.nextInt();

        if(userMod == sum) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong answer");
        }





        // Display the final score
        System.out.println( name + "Your Final Score: " + result);
//
        reader.close();
    }
}
