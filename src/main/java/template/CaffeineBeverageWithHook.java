package template;

/**
 * Template method pattern prepareRecipe()
 */
public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()){
      addCondiments();
    }
  }

  abstract void brew();
  abstract void addCondiments();

  void boilWater(){
    System.out.println("Boil!");
  }
  void pourInCup() {
    System.out.println("Pour");
  }

  /**
   * Hook, subclass has the option to override this method
   * @return
   */
  boolean customerWantsCondiments() {
    return true;
  }

}
