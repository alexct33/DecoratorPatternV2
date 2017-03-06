/**
 * Created by Oriol on 06/03/2017.
 */
public class ChromaTires extends Decorator {
    private double tire = 1250.50;

    public ChromaTires(Component c) {
        super(c);
    }

    @Override
    public double getPrice(){
        return super.getPrice()+getPackagePrice();
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "plus a special chroma tires ";
    }

    public double getPackagePrice(){
        return tire;
    }
}
