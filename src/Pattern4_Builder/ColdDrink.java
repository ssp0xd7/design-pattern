package Pattern4_Builder;

/**
 * 可乐
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
