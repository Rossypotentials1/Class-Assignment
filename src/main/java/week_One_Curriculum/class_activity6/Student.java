package week_One_Curriculum.class_activity6;

import java.security.PublicKey;

public class Student {
    public Student(int matricNo, String studentName) {
        this.matricNo = matricNo;
        this.studentName = studentName;
    }

    int matricNo;
    String studentName;
    static  String university = "Uniben";

     static void changeUniversity(){
         university = "Convenant";

     }

void display(){
    System.out.println(matricNo + " " + studentName + " "+ university);
}


}
