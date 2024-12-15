import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// <applet code=" Scroll_bar15" width=200 height=200></applet>

public class  Scroll_bar15 extends Applet implements AdjustmentListener {
    Scrollbar sc = new Scrollbar(Scrollbar.VERTICAL, 1, 1, 1, 50);
    TextField tf = new TextField();

    public void init() {
        add(new Label("Select a Value"));
        add(sc);
        add(tf);
        tf.setEditable(false);
        sc.addAdjustmentListener(this);

    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setText("" + sc.getValue());
    }
}
