package Pattern4_Builder;

/**
 * 表示实物条目和食物包装接口
 *
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public interface Item {

    /**
     * 名字
     *
     * @return
     */
    String name();

    /**
     * 包装
     *
     * @return
     */
    Packing packing();

    /**
     * 价格
     *
     * @return
     */
    float price();
}
