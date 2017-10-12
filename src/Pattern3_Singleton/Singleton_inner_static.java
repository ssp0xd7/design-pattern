package Pattern3_Singleton;

/**
 * 静态内部类
 * <p>
 * 延迟加载
 * 线程安全
 * <p>
 * 描述：利用 classloder 机制来保证初始化 instance 时只有一个线程。
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Singleton_inner_static {

    private static class SingletonHolder {
        private static final Singleton_inner_static instance = new Singleton_inner_static();
    }

    private Singleton_inner_static() {
    }

    public static final Singleton_inner_static getInstance() {
        return SingletonHolder.instance;
    }
}
