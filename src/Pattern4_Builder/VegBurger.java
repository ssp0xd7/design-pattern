package Pattern4_Builder;

/**
 * 蔬菜汉堡
 *
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 24.0f;
    }
}
