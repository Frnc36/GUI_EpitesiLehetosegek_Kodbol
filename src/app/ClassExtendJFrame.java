package app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClassExtendJFrame extends JFrame {

    private JFrame frame;

    //Nincs paramétere - ?
    public ClassExtendJFrame() {
        frame = new JFrame("ClassExtends JFrame");
        frame.setSize(320, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //ha nincs adattag, this egy már egy JFramre hivatkozik, mert öröklödött
        /* this.setTitle("");
        this.setSize(320, 240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); */
        JButton btn = new JButton("klikk ide");
        btn.setSize(10, 10);
        frame.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //                          a frame közepén fog megjelenni, ha null akkor a képernyő közepén
                JOptionPane.showMessageDialog(frame, "klikkeltél!");
                
            }
        ;
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
