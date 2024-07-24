package static_oop.Excercise1;

public class Student {
  private int id;
  private String name;
  private double score;
  private static int studentCount = 0;

  Student(int id, String name, double score) {
    this.id = id;
    this.name = name;
    this.score = score;
    studentCount++;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if ("".equals(name)) {
      System.out.println("Vui long nhap ten!!!");
    } else {
      this.name = name;
    }
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    if (score < 0 || score > 10) {
      System.out.println("Vui long nhap score trong khoang tu 0 -> 10");
    } else {
      this.score = score;
    }
  }

  public static int getStudentCount() {
    return studentCount;
  }

}
