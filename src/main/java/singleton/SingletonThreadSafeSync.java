package singleton;

/**
 * Using this approach, we rely on the JVM to create the unique instance of the Singleton when the
 * class is loaded. The JVM guarantees that the instance will be created before any thread accesses
 * the static uniqueInstance variable.
 */
public class SingletonThreadSafeSync {
  private static volatile SingletonThreadSafeSync singletonThreadSafeSync;

  private SingletonThreadSafeSync(){}

  public static SingletonThreadSafeSync getInstance() {
    if (singletonThreadSafeSync == null) {
      synchronized (SingletonThreadSafeSync.class){
        if (singletonThreadSafeSync == null) {
          singletonThreadSafeSync = new SingletonThreadSafeSync();
        }
      }

    }
    return singletonThreadSafeSync;
  }

}
