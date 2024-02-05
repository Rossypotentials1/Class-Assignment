package week_One_Curriculum.class_activity_one.class_exercise1;

public class Parent {
    String colour ;
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    public Parent(String colour) {
        this.colour = colour;
    }
    void display(){
        System.out.println(colour);
    }
}
