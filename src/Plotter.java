import java.awt.*;
import javax.swing.*;
 /**
  * Double array plotter.
  * 
  * Copied from http://www.coderanch.com/t/344345/GUI/java/Simple-Graph.
  * 
  * @see http://www.coderanch.com/t/344345/GUI/java/Simple-Graph
  * @author timp
  * @since 2011/04/30
  */
public class Plotter extends JPanel {
    Double[] data = { 25.1, 60.1, 42.1};
    final int PAD = 20;
    
    public Plotter (Double[] data) {
      this.data = data; 
    }
 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        g2.drawLine(PAD, PAD, PAD, h-PAD);
        g2.drawLine(PAD, h-PAD, w-PAD, h-PAD);
        double xScale = (w - 2*PAD)/(data.length + 1);
        double maxValue = 10.0;
        double yScale = (h - 2*PAD)/maxValue;
        // The origin location.
        int x0 = PAD;
        int y0 = h-PAD;
        g2.setPaint(Color.red);
        for(int j = 0; j < data.length; j++) {
            int x = x0 + (int)(xScale * (j+1));
            int y = y0 - (int)(yScale * data[j]);
            g2.fillOval(x-2, y-2, 4, 4);
        }
    }
 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new Plotter(new Double[]{ 25.1, 60.1, 42.1, 75.1, 99.9 }));
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
