package week_One_Curriculum.stringbuilder;

public class WorkingWithStrings {
    public static  String reverseString(String greet) {
        greet = "Nigeria";
        StringBuilder builder = new StringBuilder(greet);

        System.out.println( builder.reverse().toString());
        return greet;

    }
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        reverseString("Goodness");

    }
}
