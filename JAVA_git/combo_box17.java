import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//<applet code="combo_box17" width=200 height=200></applet>
public class combo_box17 extends Applet implements ItemListener {
    Choice c;

    public void init() {
        c = new Choice();
        Label l = new Label("Choose a Color :");
        c.add("White");
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        c.add("Black");
        c.addItemListener(this);
        add(l);
        add(c);
    }

    public void itemStateChanged(ItemEvent e) {
        String col = c.getSelectedItem();
        if (col == "Red") {
            setBackground(Color.red);
        } else if (col == "Green") {
            setBackground(Color.green);
        } else if (col == "Blue") {
            setBackground(Color.blue);
        } else if (col == "Black") {
            setBackground(Color.black);
        } else if (col == "White") {
            setBackground(Color.white);
        }

    }
}