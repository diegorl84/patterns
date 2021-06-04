package singleton;

/**
 * Using this approach, we rely on the JVM to create the unique instance of the Singleton when the
 * class is loaded. The JVM guarantees that the instance will be created before any thread accesses
 * the static uniqueInstance variable.
 */
public class SingletonThreadSafe {
  private static SingletonThreadSafe singletonThreadSafe = new SingletonThreadSafe();

  private SingletonThreadSafe(){}

  public static SingletonThreadSafe getInstance(){
    return singletonThreadSafe;
  }

}
