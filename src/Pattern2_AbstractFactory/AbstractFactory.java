package Pattern2_AbstractFactory;

/**
 * 颜色和形状的抽象工厂
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
