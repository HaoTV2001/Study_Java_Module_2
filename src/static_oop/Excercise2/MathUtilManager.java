package static_oop.Excercise2;

public class MathUtilManager {
  public static void main(String[] args) {
    double a = 12.5;
    double b = 5.5;

    System.out.println("Tong: "+MathUtil.sum(a,b));
    System.out.println("Hieu: "+MathUtil.subtract(a,b));
    System.out.println("Tich: "+MathUtil.multiply(a,b));
    System.out.printf("Thuong: %.2f",MathUtil.divide(a,b));
  }
}
