package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
                
                JButton btn = new JButton("klikk ide");
                frame.add(btn);
                btn.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        //                          a frame közepén fog megjelenni, ha null akkor a képernyő közepén
                    JOptionPane.showMessageDialog(frame, "klikkeltél!");};
                });
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    private void go() {

    }
}
