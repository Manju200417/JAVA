import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="Keyboard_event20" width=300 height=200></applet>
public class  Keyboard_event20 extends Applet implements KeyListener
{
    String msg = "You Typed: ";
    public void init() {addKeyListener(this);}
    public void keyPressed(KeyEvent e)
    {
        showStatus("Key Down");
    }
    public void keyReleased(KeyEvent e)
    {
        showStatus("Key Up");
    }
    public void keyTyped(KeyEvent e)
    {
        msg+=e.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,20,50);
    }
}
