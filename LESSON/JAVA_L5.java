import javax.swing.JOptionPane;

public class JAVA_L5 {
  public static void main(String[] args) {
    String name = javax.swing.JOptionPane.showInputDialog("Enter You Name:    ");
    JOptionPane.showMessageDialog(null, " Hello "+name );

    int age =Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age:   ")) ;
    JOptionPane.showMessageDialog(null, "Hello " +name+" Your Age "+age );

    double height =Double.parseDouble(JOptionPane.showInputDialog("Enter Your Heigh:   ")) ;
    JOptionPane.showMessageDialog(null, "Hello" +name+" Your Age "+age+(" Your Height"+height) );
    
    
  }
}
