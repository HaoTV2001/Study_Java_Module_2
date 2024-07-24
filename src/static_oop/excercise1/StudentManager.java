package static_oop.excercise1;

public class StudentManager {
  public static void main(String[] args) {
    Student student_1 = new Student(345, "HaoTV", 9.5);
    Student student_2 = new Student(345, "HaoTV", 9.5);
    Student student_3 = new Student(345, "HaoTV", 9.5);
    Student student_4 = new Student(345, "HaoTV", 9.5);

    System.out.println("So luong hoc sinh: "+Student.getStudentCount());

  }
}
