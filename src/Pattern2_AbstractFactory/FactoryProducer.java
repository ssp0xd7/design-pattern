package Pattern2_AbstractFactory;

/**
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        Shape circle = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        circle.draw();

        //获取形状为 Rectangle 的对象
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        rectangle.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        Color red = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        red.fill();
    }
}
