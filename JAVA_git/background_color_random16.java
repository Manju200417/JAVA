import java.applet.*;
import java.awt.*;
//<applet code = "background_color_random16" width = 100 height = 100 ></applet>
public class background_color_random16 extends Applet implements Runnable {

    public void init() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);

            Color color = new Color(red, green, blue);
            setBackground(color);
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
        }

    }
}






