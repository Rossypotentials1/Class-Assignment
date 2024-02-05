package week_One_Curriculum.class_activity_two;

public class OverloadingExample {
    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }
    static float add(float a, int b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
}
