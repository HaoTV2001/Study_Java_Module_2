package static_oop.excercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateUtil {

  public static LocalDate fromString_ddMMyyyy(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    try {
      return LocalDate.parse(date, formatter);
    } catch (DateTimeParseException e) {
      System.err.println("Invalid date format: " + date);
      return null;
    }
  }

  public static LocalDate fromString_yyyyMMdd(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    try {
      return LocalDate.parse(date, formatter);
    } catch (DateTimeParseException e) {
      System.err.println("Invalid date format: " + date);
      return null;
    }
  }

  public static String toString_ddMMyyyy(LocalDate date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return date.format(formatter);
  }

  public static String toString_yyyyMMdd(LocalDate date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return date.format(formatter);
  }

}

