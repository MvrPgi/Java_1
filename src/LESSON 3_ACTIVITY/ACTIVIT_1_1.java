import javax.swing.JOptionPane;

public class ACTIVIT_1_1 {
    public static void main(String[] args) {
        // student information
        String name = JOptionPane.showInputDialog("What Is Your Name: ");
        String course = JOptionPane.showInputDialog("Course: ");

        // grades
        int Q1 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Quiz 1: "));
        int Q2 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Quiz 2: "));
        int R1 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Recitation 1: "));
        int R2 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Recitation 2: "));
        int P1 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Project 1: "));
        int P2 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Project 2: "));
        int E1 = Integer.parseInt(JOptionPane.showInputDialog("Grade For Exam: "));

        // formula
        int Qavg = (Q1 + Q2) / 2;
        int Ravg = (R1 + R2) / 2;
        int Pavg = (P1 + P2) / 2;
        int classtand = (Qavg + Ravg + Pavg) / 3;
        int prelim = (classtand * 2 + E1) / 3;

        // printing grades and student information
        JOptionPane.showMessageDialog(null, "Your Name: " + name + "\nYour Course: " + course + "\nYour Class Stand Is: " + classtand + "\nYour Prelim Is: " + prelim);
    }
}
