package semester3;

import javax.swing.JOptionPane;

public class PBO1 {
    public static void main(String[] args) {
        System.out.println("\"Belajar JAVA\"");
        System.out.println("\"Sangat mudah sekali\"");
        System.out.println("\"dan menyenangkan\"");
        
        String textInput = JOptionPane.showInputDialog("Anda sedang belajar apa?");
        JOptionPane.showMessageDialog(null, "Belajar " +textInput+ " sangat mudah");
    }
}
