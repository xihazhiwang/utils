package han.design.singleton;

/**
 * 懒汉式(线程安全)
 *
 * @author hanbo
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）,方法进行同步效率太低
 * <p>
 * 结论：在实际开发中，不推荐使用这种方式
 */
public class Singleton4 {

    private static Singleton4 INSTANCE;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }

}
