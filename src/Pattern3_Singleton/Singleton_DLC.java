package Pattern3_Singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * <p>
 * 延迟加载
 * 线程安全
 * <p>
 * 描述：采用双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Singleton_DLC {

    private volatile static Singleton_DLC instance;

    private Singleton_DLC() {
    }

    public static Singleton_DLC getInstance() {
        if (instance == null) {
            synchronized (Singleton_DLC.class) {
                if (instance == null) {
                    instance = new Singleton_DLC();
                }
            }
        }
        return instance;
    }
}
