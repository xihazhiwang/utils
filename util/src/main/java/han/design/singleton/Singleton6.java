package han.design.singleton;

/**
 * 懒汉式(线程安全，同步代码块，双重检查)
 *
 * @author hanbo
 * <p>
 * Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两
 * 次if (singleton == null)检查，这样就可以保证线程安全了。
 * <p>
 * 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
 * 直接return实例化对象，也避免的反复进行方法同步.
 * <p>
 * 线程安全；延迟加载；效率较高
 * <p>
 * <b>结论：在实际开发中，推荐使用这种单例设计模式</b>
 */
public class Singleton6 {

    private static Singleton6 INSTANCE;

    private Singleton6() {

    }

    public static Singleton6 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton6.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }

}
