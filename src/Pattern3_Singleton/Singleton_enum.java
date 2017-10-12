package Pattern3_Singleton;

/**
 * 基于枚举
 * <p>
 * 非延迟加载
 * 线程安全
 * <p>
 * 描述：是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * <p>
 * enum是基于Class的，有且仅有private的构造器，反编译后其实是
 * public final class T extends Enum{...}
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public enum Singleton_enum {

    INSTANCE;

    private String name = "test";

    private Singleton_enum() {
    }

    public static void main(String[] args) {
        System.out.println(Singleton_enum.INSTANCE.name);
    }
}
