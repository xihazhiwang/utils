package han.design.singleton;

/**
 * 懒汉式(线程安全，同步代码块)
 *
 * @author hanbo
 * <p>
 * 这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低，
 * 改为同步产生实例化的的代码块
 * <p>
 * 但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一
 * 致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例
 * <p>
 * <b>结论：在实际开发中，不能使用这种方式</b>
 */
public class Singleton5 {
    private static Singleton5 INSTANCE;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}
