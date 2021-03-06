package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

  @Override
  void brew() {
    System.out.println("Dripping coffee ");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  boolean customerWantsCondiments() {
    String answer = getUserInput();

    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }

  private String getUserInput() {
    String answer = null;
    System.out.println("Would you like milk and sugar (y/n)?");

    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      answer = in.readLine();
    } catch (IOException e) {
      System.err.println("Error");
    }

    if (answer == null) {
      return "no";
    }
    return answer;
  }
}
