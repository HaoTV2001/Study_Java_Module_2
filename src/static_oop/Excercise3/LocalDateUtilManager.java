package static_oop.Excercise3;

import java.time.LocalDate;

public class LocalDateUtilManager {

  public static void main(String[] args) {
    String dateStr1 = "25/12/2023";
    LocalDate date1 = LocalDateUtil.fromString_ddMMyyyy(dateStr1);
    System.out.println("Ngay da chuyen doi tu String: " + date1);

    String dateStr2 = "2023/12/25";
    LocalDate date2 = LocalDateUtil.fromString_yyyyMMdd(dateStr2);
    System.out.println("Ngay da chuyen doi tu String: " + date2);

    LocalDate now = LocalDate.now();
    System.out.println("String da chuyen doi tu ngay: " + LocalDateUtil.toString_ddMMyyyy(now));
    System.out.println("String da chuyen doi tu ngay: " + LocalDateUtil.toString_yyyyMMdd(now));
  }
}
