package contructor_accessmodifier.Excercise2;

public class Timee {
  private int hour;
  private int minute;
  private int second;

  public Timee() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
  };

  public Timee(int hour) {
    this.hour = hour;
    this.minute = 0;
    this.second = 0;
  }

  public Timee(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
    this.second = 0;
  }

  public Timee(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Timee(Timee timee) {
    this.hour = timee.getHour();
    this.minute = timee.getMinute();
    this.second = timee.getSecond();
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour < 0 || hour > 24) {
      System.out.println("Gio khong hop le!!!");
    } else {
      this.hour = hour;
    }
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 60) {
      System.out.println("Phut khong hop le!!!");
    } else {
      this.minute = minute;
    }
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    if (second < 0 || second > 60) {
      System.out.println("Giay khong hop le!!!");
    } else {
      this.second = second;
    }
  }

  public void output() {
    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
  }

}
