import java.awt.*;       // Using AWT containers and components
import java.awt.event.*; // Using AWT events and listener interfaces
import javax.swing.*;    // Using Swing components and containers
 
// A Swing GUI application inherits from top-level container javax.swing.JFrame
public class SwingCounter extends JFrame {
   private JTextField tfCount;  // Use Swing's JTextField instead of AWT's TextField
   private int count = 0;
 
   /** Constructor to setup the GUI */
   public SwingCounter () {
      // Retrieve the content-pane of the top-level container JFrame
      // All operations done on the content-pane
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
 
      cp.add(new JLabel("Counter"));
      tfCount = new JTextField("0", 10);
      tfCount.setEditable(false);
      cp.add(tfCount);
 
      JButton btnCount = new JButton("Count");
      cp.add(btnCount);
 
      // Allocate an anonymous instance of an anonymous inner class that
      //  implements ActionListener as ActionEvent listener
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            ++count;
            tfCount.setText(count + "");
         }
      });


 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit program if close-window button clicked
      setTitle("Swing Counter"); // "this" JFrame sets title
      setSize(300, 100);         // "this" JFrame sets initial size
      setVisible(true);          // "this" JFrame shows
   }

   public void increaseCount()
   {
      count ++;
      tfCount.setText(count + "");
   }
 
   /** The entry main() method */
   public static void main(String[] args) {
      // Run the GUI construction in the Event-Dispatching thread for thread-safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingCounter(); // Let the constructor do the job
         }
      });
   }
}