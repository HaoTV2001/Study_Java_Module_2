package java_overview.exercise3;

import java.util.Scanner;

public class Point {
  double x;
  double y;

  public void input() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Nhap toa do X: ");
    x = Double.parseDouble(scan.nextLine());

    System.out.print("Nhap toa do Y: ");
    y = Double.parseDouble(scan.nextLine());
  }

  public double distanceTo(Point otherPoint) {
    return Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
  }

}
