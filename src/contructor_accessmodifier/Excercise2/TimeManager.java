package contructor_accessmodifier.Excercise2;

public class TimeManager {
  public static void main(String[] args) {
    Timee time_1 = new Timee();
    time_1.output();

    Timee time_2 = new Timee(7);
    time_2.output();

    Timee time_3 = new Timee(7,30);
    time_3.output();

    Timee time_4 = new Timee(24,30,50);
    time_4.output();

    Timee time_5 = new Timee(time_4);
//    time_5.setHour(25);
    time_5.output();

  }
}
