package singleton;

public class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {}

  /**
   * The only time synchronization is relevant is the first time through this method. In other
   * words, once we’ve set the uniqueInstance variable to an instance of Singleton, we have no
   * further need to synchronize this method. After the first time through, synchronization is
   * totally unneeded overhead!
   *
   * WARNING: Synchronizing a method can decrease performance by a factor of 100,
   * so if a high-traffic part of your code begins using getInstance(), you may have to reconsider.
   *
   * @return
   */
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}
