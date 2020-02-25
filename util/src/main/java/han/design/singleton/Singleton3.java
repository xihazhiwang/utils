package han.design.singleton;

/**
 * 懒汉式(线程不安全)
 *
 * @author hanbo
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：否
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * <p>
 * 起到了Lazy Loading的效果，但是只能在单线程下使用。
 * 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及
 * 往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以
 * 在多线程环境下不可使用这种方式
 * <p>
 * 结论：在实际开发中，不要使用这种方式.
 */
public class Singleton3 {

    private static Singleton3 INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

}
