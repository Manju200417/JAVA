import java.awt.*;
import java.applet.*;
//<applet code="Geomet_Figures14" width = 200 height = 200 ></applet>
public class Geomet_Figures14 extends Applet{
    public void paint(Graphics g) {
        g.setFont(new Font("Cambria", Font.BOLD, 15));
        g.drawString("Different Shapes", 15, 15);

        g.drawLine(10, 10, 50, 60); 
        g.drawRect(10, 70, 40, 40); 

        g.setColor(Color.BLUE);
        g.fillOval(60, 20, 60, 60);
        g.fillArc(60, 135, 80, 40, 180, 180); 
        g.fillRoundRect(20, 120, 60, 30, 5, 5); 
    }
}