import javax.swing.JFrame;

/**
 * Plot a Double array.
 * 
 * Copied from http://www.coderanch.com/t/344345/GUI/java/Simple-Graph.
 * 
 * @see http://www.coderanch.com/t/344345/GUI/java/Simple-Graph
 * @author timp
 * @since 2011/04/30
 */

public class Plot {
  public Plot(Double[] data) { 
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(new Plotter(data));
    f.setSize(400,400);
    f.setLocation(200,200);
    f.setVisible(true);
    
  }
  public static void main(String[] args) {   
    new Plot(new Double[]{ 25.1, 60.1, 42.1, 75.1, 99.9 });
  }
}
