package Pattern4_Builder;

/**
 * 抽象汉堡
 *
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
