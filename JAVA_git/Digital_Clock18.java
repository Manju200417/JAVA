import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

//<applet code="Digital_Clock18" width=300 height=200></applet>
public class Digital_Clock18 extends Applet implements Runnable {
    Thread t;
    String timeString;

    public void init() {
        setBackground(Color.blue);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            timeString = new SimpleDateFormat("hh:mm:ss").format(new Date());
            repaint();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString(timeString, 50, 50);
    }
}