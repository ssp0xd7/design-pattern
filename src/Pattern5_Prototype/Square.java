package Pattern5_Prototype;

/**
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
