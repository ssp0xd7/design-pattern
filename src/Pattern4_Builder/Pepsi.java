package Pattern4_Builder;

/**
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 12.5f;
    }
}
