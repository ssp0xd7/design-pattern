package Pattern2_AbstractFactory;

/**
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
