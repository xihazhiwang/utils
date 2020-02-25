package han.design.singleton;

/**
 * 单例模式：饿汉式 静态常量 (多线程安全)
 *
 * @author hanbo
 * <p>
 * 是否 Lazy 初始化：否
 * <p>
 * 是否多线程安全：是
 * <p>
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * <p>
 * 优点：没有加锁，执行效率会提高。
 * <p>
 * 缺点：类加载时就初始化，浪费内存。
 * <p>
 * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
 * <p>
 * 结论：结论：这种单例模式<b>可用</b>，可能造成内存浪费
 */
public class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
