package java_overview.exercise1;

import java.util.Scanner;

public class Student {
  String name;
  double mathScore;
  double literatureScore;

  public void input() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Nhap ten hoc sinh: ");
    name = scan.nextLine();

    do {
      System.out.print("Nhap diem toan: ");
      mathScore = Double.parseDouble(scan.nextLine());
      if (mathScore < 0 || mathScore > 10) {
        System.out.println("Vui long nhap diem toan trong khoang <0 - 10> !!!");
      }
    } while (mathScore < 0 || mathScore >10);

    do {
      System.out.print("Nhap diem van: ");
      literatureScore = Double.parseDouble(scan.nextLine());
      if (literatureScore < 0 || literatureScore > 10) {
        System.out.println("Vui long nhap diem van trong khoang <0 - 10> !!!");
      }
    } while (literatureScore < 0 || literatureScore >10);
  }

  public double calculateAverageScore() {
    return (mathScore + literatureScore) / 2;
  }

  public void output() {
    System.out.println("\n====== Thong tin hoc sinh ======");
    System.out.println("Ten: "+name);
    System.out.println("Diem toan: "+mathScore);
    System.out.println("Diem van: "+literatureScore);
    System.out.println("Diem trung binh: "+calculateAverageScore());
  }

}
