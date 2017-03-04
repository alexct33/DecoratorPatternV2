/**
 * Created by Àlex on 4/3/2017.
 */

public abstract class Decorator implements Component{
    protected final Component decoratedComponent;

    public Decorator(Component c){
        this.decoratedComponent = c;
    }

    @Override
    public double getPrice(){
        return decoratedComponent.getPrice();
    }

    @Override
    public String getDescription(){
        return decoratedComponent.getDescription();
    }
}