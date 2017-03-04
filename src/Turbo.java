/**
 * Created by Àlex on 4/3/2017.
 */

public class Turbo extends Decorator {

        private double turbo = 4999.99;

        public Turbo(Component c) {
            super(c);
        }

        @Override
        public double getPrice(){
            return super.getPrice()+getPackagePrice();
        }

        @Override
        public String getDescription(){
            return super.getDescription() + "plus a turbo than increases his power.";
        }

        public double getPackagePrice(){
            return turbo;
        }
}
