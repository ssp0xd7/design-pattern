package Pattern5_Prototype;

/**
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public class Rectangle extends Shape {

    public Rectangle() {
        setType("Rectangle");
    }


    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
