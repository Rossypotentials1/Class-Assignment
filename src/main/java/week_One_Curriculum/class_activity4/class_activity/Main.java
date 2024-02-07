package week_One_Curriculum.class_activity4.class_activity;

public class Main {
    public static void main(String[] args) {
//        A4Paper paper = new A4Paper();
//        paper.print();

        Developer developer = new Developer(12, "Emma Onah");
        Developer developer1 = new Developer(12, "Praise Jonah");
        Developer developer2 = new Developer(12, "Vivian Bako");
        Developer developer4 = new Developer(12, "Sani Dogo");
        Developer developer5 = new Developer(12, "Isioma Chidera");

        Developer.institute = "Semicolon";
        developer.display();
        developer1.display();
        developer2.display();
        developer4.display();
        developer5.display();

    }
}
