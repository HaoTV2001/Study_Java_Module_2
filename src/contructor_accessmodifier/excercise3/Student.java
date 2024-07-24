package contructor_accessmodifier.excercise3;

public class Student {
  private int id;
  private String name;
  private double score;

  public Student() {};

  public Student(int id) {
    this.id = id;
  }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  Student(int id, String name, double score) {
    this.id = id;
    this.name = name;
    this.score = score;
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

  public void output() {
    System.out.println("====== thong tin hoc sinh ======");
    System.out.println("id: "+id);
    System.out.println("Ten: "+name);
    System.out.println("Diem: "+score);
  }

}
