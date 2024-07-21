package java_overview.Exercise3;

public class DistanceCalculator {

  public static void main(String[] args) {
    Point point = new Point();
    Point anotherPoint = new Point();

    System.out.print("Nhap toa do diem thu nhat: ");
    point.input();

    System.out.print("Nhap toa do diem thu hai: ");
    anotherPoint.input();

    System.out.print("Khoang cach giua hai diem la: "+point.distanceTo(anotherPoint));
  }
}
