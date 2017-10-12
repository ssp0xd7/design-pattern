package Pattern3_Singleton;

/**
 * 懒汉式，线程不安全
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Singleton {

    private static Singleton instance;

    //私有构造方法
    private Singleton() {
    }

    //共有get方法
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
