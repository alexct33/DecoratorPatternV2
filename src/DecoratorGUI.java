import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Àlex on 4/3/2017.
 */
public class DecoratorGUI {


    private JTextArea fordMustangCustomizationTextArea;
    private JTextField finalPrice;
    private JTextArea finalPriceTextArea;
    private JButton addTurboButton;
    private JPanel panel;
    private JButton addChromeTiresButton;
    private JButton automaticGearsButton;
    private FordMustang fm = new FordMustang();
    private Turbo t = new Turbo(fm);
    private ChromaTires ctires = new ChromaTires(fm);
    private AutomaticGears autogears = new AutomaticGears(fm);
    static double price;


    public DecoratorGUI() {
        addTurboButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                price = t.getPrice();
            }
        });
        addChromeTiresButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                price = ctires.getPrice();
            }
        });
        automaticGearsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                price = autogears.getPrice();
            }
        });
    }

    public void init() {
        fm.setPrice(40000); //defaul car price
        fordMustangCustomizationTextArea.setSize(20,20);
        JFrame jf = new JFrame("Ford Mustang Customization");
        jf.setContentPane(panel);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.pack();
        jf.setVisible(true);
        //jf.setSize(1000,700);

        price = fm.getPrice();

        while(true) {

            finalPrice.setText(String.valueOf(price + " €"));

        }



    }
}
