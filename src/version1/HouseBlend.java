package version1;

/**
 *
 * @author Head First Design Patterns
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.setDescription("House Blend");
    }

    @Override
    public double cost() {
        return .99;
    }

}
