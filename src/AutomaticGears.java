/**
 * Created by Oriol on 06/03/2017.
 */
public class AutomaticGears extends Decorator{
    private double automaticGear = 2500.00;

    public AutomaticGears(Component c) {
        super(c);
    }

    @Override
    public double getPrice(){
        return super.getPrice()+getPackagePrice();
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "plus an automatic gears ";
    }

    public double getPackagePrice(){
        return automaticGear;
    }
}
