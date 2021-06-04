package template;

public class AppWithHook {
  public static void main(String[] args) {
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    System.out.println("\nMaking coffee:");
    coffeeWithHook.prepareRecipe();

  }
}
