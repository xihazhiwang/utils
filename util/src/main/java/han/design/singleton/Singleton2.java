package han.design.singleton;

/**
 * 单例模式：饿汉式 静态代码块 (多线程安全)
 *
 * @author hanbo
 * <p>
 * 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块
 * 中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优
 * 缺点和上面是一样的。
 * <p>
 * 结论：这种单例模式<b>可用</b>，但是可能造成内存浪费
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

}
