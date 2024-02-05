package week_One_Curriculum.class_activity_one;

public class Main {
    public static void main(String[] args) {
        InternshipForm form = new InternshipForm("Rose Nnena", 28,"Female");
        InternshipForm form2 = new InternshipForm("Valentine Alfrad", 38,"Male");
        System.out.println("Name: " + form.name);
        System.out.println("Age: " + form.age);
        System.out.println("Gender: " + form.gender);
        System.out.println("Name: " + form2.name);
        System.out.println("age: " + form2.age);
        System.out.println("Gender: " + form2.gender);
    }
}
