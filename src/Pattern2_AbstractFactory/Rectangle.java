package Pattern2_AbstractFactory;

/**
 * Shape的具体实现类
 *
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
