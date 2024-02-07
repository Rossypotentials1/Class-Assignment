package week_One_Curriculum.class_activity8;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int num = 500/0;
        }catch (Exception e){
            System.out.println(e);

        }
        System.out.println("Run other code");
    }
}
