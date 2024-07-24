package contructor_accessmodifier.Excercise3;

public class StudentManager {
  public static void main(String[] args) {
    Student student_1 = new Student();
    student_1.output();

    Student student_2 = new Student(123);
    student_2.output();

    Student student_3 = new Student(234, "HaoTV");
    student_3.output();

    Student student_4 = new Student(345, "HaoTV", 9.5);
    student_4.output();
//    student_4.setName("");
//    student_4.setScore(11);
  }

}
