package week_One_Curriculum.class_activity4.class_activity;

public class Developer {
    int id;
    String name;
    static  String institute = "Decagon";

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;

    }
    void display(){
        System.out.println(id + " " + name + institute);
    }
}
