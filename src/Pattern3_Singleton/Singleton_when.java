package Pattern3_Singleton;

/**
 * 懒汉式
 *
 * 延迟加载
 * 线程安全
 * <p>
 * 描述：效率很低，99% 情况下不需要同步。
 * <p>
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Singleton_when {

    private static Singleton_when instance;

    private Singleton_when() {
    }

    public static synchronized Singleton_when getInstance() {
        if (instance == null) {
            instance = new Singleton_when();
        }
        return instance;
    }
}
