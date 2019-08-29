import java.applet.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class DrawSomething extends Applet {
  
    public void init() {
      Color brass = new Color(175, 130, 110);
      setBackground(brass);
    }
  
    public void paint (Graphics page) {
      Color angryRed = new Color (213, 24, 52); 
      page.setColor(angryRed); // set red
      page.fillArc(100, 100, 425, 400, 0, 360); // body
      Path2D path = new Path2D.Double();
      path.moveTo(300, 115);
      path.quadTo(100, 120, 120, 110);
      BasicStroke s = new BasicStroke(25);
      Graphics2D page2 = (Graphics2D)page;
      page2.fill(s.createStrokedShape(path)); // lower "comb"
      Path2D path2 = new Path2D.Double();
      path2.moveTo(300,110);
      path2.quadTo(100, 70, 160, 70);
      page2.fill(s.createStrokedShape(path2)); // upper "comb"
      page.setColor(Color.WHITE); // set white
      page.fillOval(330, 260, 85, 85); // eye left
      page.fillOval(407, 260, 85, 85); // eye right
      Color angryBlack = new Color (0, 8, 5); 
      page.setColor(angryBlack); // set black
      page.fillOval(370, 288, 27, 27); // pupil left
      page.fillOval(425, 288, 27, 27); // pupil right
      int[] x = {320, 315, 415, 415};
      int[] y = {230, 260, 295, 265};
      page.fillPolygon(x, y, x.length); // eyebrow left
      int[] x2 = {415, 415, 510, 510};
      int[] y2 = {295, 265, 215, 245};
      page.fillPolygon(x2, y2, x2.length); // eyebrow right
      page.fillRect(35, 260, 75, 35); // straight tail part
      int[] x3 = {38, 38, 105, 110};
      int[] y3 = {250, 220, 250, 270};
      page.fillPolygon(x3, y3, x3.length); // upper tail part
      int[] x4 = {105, 105, 35, 38};
      int[] y4 = {270, 300, 340, 310};
      page.fillPolygon(x4, y4, x4.length); // lower tail part
      Color angryYellow = new Color (248, 184, 58); 
      page.setColor(angryYellow); // set yellow
      int[] x5 = {409, 379, 465};
      int[] y5 = {320, 365, 365};
      page.fillPolygon(x5, y5, x5.length); // upper beak
      int[] x6 = {379, 450, 409};
      int[] y6 = {365, 365, 390};
      page.fillPolygon(x6, y6, x6.length); // lower beak
    }
}