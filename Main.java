import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Main {
   private static void createAndShowGUI() {
      JFrame frame = new JFrame("Simple Window");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel label = new JLabel("Hello, Swing !", JLabel.CENTER);
      frame.getContentPane().add(label);
      
      frame.setSize(300,200);
      frame.setVisible(true);
      
      
   }
   
   public static void main(String[] args) {
      SwingUtilities.invokeLater(Main::createAndShowGUI);
   }
}
