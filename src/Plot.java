import javax.swing.JFrame;


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
