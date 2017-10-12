package Pattern3_Singleton;

/**
 * 恶汉式
 *
 * 非延迟加载
 * 线程安全
 * <p>
 * 描述：较常用，但容易产生垃圾对象。
 * <p>
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Singleton_do {

    private static Singleton_do instance = new Singleton_do();

    private Singleton_do() {
    }

    public static Singleton_do getInstance() {
        return instance;
    }
}
