package Pattern1_Factory;

/**
 * @author kevin(ssp0xd7@gmail.com) 2017/10/12
 */
public class ColorFacory {

    public static Color getColor(int color){
        if(color == 0){
            return new ColorA();
        }
        if(color == 1){
            return new ColorA();
        }else if(color == 2){
            return new ColorB();
        }
        return new ColorA();
    }

    public static void main(String[] args) {
        Color color = ColorFacory.getColor(1);
        System.out.println(color.showColor());
    }
}
