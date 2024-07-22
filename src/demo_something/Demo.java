package demo_something;

import java.util.Scanner;

public class Demo {

  public void input() {
    Scanner scan = new Scanner(System.in);


  }

  public void output() {
    System.out.println("Hello world!");
  }

  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.input();
    demo.output();

  }
}
