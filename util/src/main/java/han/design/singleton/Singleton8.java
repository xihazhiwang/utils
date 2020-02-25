package han.design.singleton;

/**
 * 枚举
 *
 * @author hanbo
 * <p>
 * JDK 版本：JDK1.5 起
 * <p>
 * 是否 Lazy 初始化：否
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * 不能通过 reflection attack 来调用私有构造方法。
 *
 * <b>结论：推荐使用</b>
 */

public enum Singleton8 {

    INSTANCE;

    public void method() {
        // 需要使用的方法
        System.out.println("1");
    }

    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance == instance2);
    }
}
