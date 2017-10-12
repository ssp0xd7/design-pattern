package Pattern2_AbstractFactory;

/**
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
