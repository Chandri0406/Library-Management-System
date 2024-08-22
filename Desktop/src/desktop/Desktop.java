package desktop;
import GUI.maindashboard;

public class Desktop {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maindashboard().setVisible(true);
            }
        });
    }
}
