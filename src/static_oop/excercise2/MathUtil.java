package static_oop.excercise2;

public class MathUtil {

  public static double sum(double a, double b) {
    return a + b;
  }

  public static double subtract(double a, double b) {
    return a - b;
  }

  public static double multiply(double a, double b) {
    return a * b;
  }

  public static double divide(double a, double b) {
    if (b == 0) {
      System.out.println("Khong the chia cho 0!!!");
      return 0;
    } else {
      return a / b;
    }
  }

}
