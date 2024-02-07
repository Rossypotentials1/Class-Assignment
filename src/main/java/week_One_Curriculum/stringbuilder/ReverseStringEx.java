package week_One_Curriculum.stringbuilder;

public class ReverseStringEx {
    public static void main(String[] args) {
        String greet = " Hello";
        System.out.println(reverseStr(greet));
    }
    public static String reverseStr(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.charAt(3));
        System.out.println(stringBuilder.reverse());



        return "";
    }
}
