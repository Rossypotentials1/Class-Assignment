package week_One_Curriculum.class_activity8;

public class ExerciseOnException {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        int num3;
        try {
          num3 = num1 / num2;
        }catch (Exception e){

//            num3 = num1 / num2 + 2;
            System.out.println(num1/(num2 + 2) );

        }
    }
}
