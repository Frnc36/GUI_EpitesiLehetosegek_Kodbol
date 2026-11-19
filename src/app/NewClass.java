package app;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NewClass {

    public static void main(String[] args) {
        /* Frame frame = new JFrame("GUI kódból");
        frame.setVisible(true); */

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("GUI kódboól");
                frame.setSize(320, 240);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE = 3
                frame.setVisible(true);
            }
        });
    }

    private void go() {

    }
}
