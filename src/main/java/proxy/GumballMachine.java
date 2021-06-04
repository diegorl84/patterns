package proxy;

import java.util.Arrays;
import java.util.List;

public class GumballMachine {
  public static void main(String[] args) {
    List<String> courses = Arrays.asList("Java", "Python", "Javascript", "NodeJS");
    long count = courses.stream().filter(x -> x.startsWith("J")).count();

    System.out.println(count);
  }
}
