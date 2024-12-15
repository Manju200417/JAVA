import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Mouse_events19" height=300 width=400></applet>*/

public class Mouse_events19 extends Applet implements MouseListener, ActionListener {
    int x1, y1, x2, y2;
    Button r, g, b, bl;
    String colorChoice = "";

    public void init() {
        r = new Button("Red");
        g = new Button("Green");
        b = new Button("Black");
        bl = new Button("Blue");

        add(r); add(g); add(b); add(bl);
        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
        bl.addActionListener(this);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) { x1 = e.getX(); y1 = e.getY(); }
    public void mouseReleased(MouseEvent e) { x2 = e.getX(); y2 = e.getY(); repaint(); }
    public void mouseClicked(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}

    public void paint(Graphics g) {
        if ("red".equals(colorChoice)) g.setColor(Color.red);
        else if ("green".equals(colorChoice)) g.setColor(Color.green);
        else if ("black".equals(colorChoice)) g.setColor(Color.black);
        else if ("blue".equals(colorChoice)) g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == r) colorChoice = "red";
        if (ae.getSource() == g) colorChoice = "green";
        if (ae.getSource() == b) colorChoice = "black";
        if (ae.getSource() == bl) colorChoice = "blue";
    }
}
