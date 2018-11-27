import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class draw extends JPanel {


  /*
   * g.setColor(Color.BLUE);
   * 
   * // Parameters are x, y, width, and height g.fillRect(25, 25, 100, 30);
   * 
   * // Parameter for new color is Red, Green, Blue g.setColor(new Color(190, 81, 215));
   * g.fillRect(25, 65, 100, 30);
   * 
   * g.setColor(Color.RED); g.drawString("This is some awesome text", 25, 120);
   */

  // g.setColor(Color.GREEN);
  // g.fillOval(65, 65, 50, 50);

  int x = 0;
  int y = 0;
  int angleX = 1;
  int angleY = 1;

  public void move() {
    if (x + angleX < 0) {
      angleX = 1;
    } else if (x + angleX > getWidth() - 50) {
      angleX = -1;
    } else if (y + angleY < 0) {
      angleY = 1;
    } else if (y + angleY > getHeight() - 50) {
      angleY = -1;
    }

    x = x + angleX;
    y = y + angleY;

  }

  @Override
  public void paint(Graphics g) {
    // g.setColor(Color.GREEN);
    super.paint(g);
    g.fillOval(x, y, 50, 50);
  }

}

