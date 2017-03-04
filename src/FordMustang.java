/**
 * Created by Àlex on 4/3/2017.
 */
public class FordMustang implements Component {
    double price;

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getDescription(){
        return "This is the basic model of the car";
    }


    public void setPrice(double price) {
       this.price = price;
    }
}
