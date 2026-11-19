package app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

public class NewClass {
    
    private static int ujGombSzam = 6;

    public static void main(String[] args) {
        /* Frame frame = new JFrame("GUI kódból");
        frame.setVisible(true); */

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("GUI kódboól");
                frame.setSize(320, 240);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE = 3
                //frame.setLayout(new FlowLayout(FlowLayout.LEFT)); //balra igazit
                //frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
                //frame.setLayout(new GridLayout(0, 3, 5, 5));

                JButton ujGomb = new JButton("Uj gomb");
                frame.add(ujGomb);

                frame.setLayout(new FlowLayout());
                JPanel pnl = new JPanel(new BorderLayout());
                pnl.setBorder(new BevelBorder(BevelBorder.RAISED));
                frame.add(pnl);

                ujGomb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton b = new JButton("Új Gomb" + ujGombSzam++);
                        pnl.add(b);
                    }

                });

                JButton btn1 = new JButton("klikk ide");
                JButton btn2 = new JButton("gomb2");
                JButton btn3 = new JButton("gomb3");
                JButton btn4 = new JButton("gomb4");
                JButton btn5 = new JButton("gomb3");

                pnl.add(btn1, BorderLayout.CENTER);
                pnl.add(btn2, BorderLayout.NORTH);
                pnl.add(btn3, BorderLayout.EAST);
                pnl.add(btn4, BorderLayout.SOUTH);
                pnl.add(btn5, BorderLayout.WEST);
                pnl.add(Box.createHorizontalGlue()); //vizszintes térköz beállítás

                btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //                          a frame közepén fog megjelenni, ha null akkor a képernyő közepén
                        JOptionPane.showMessageDialog(frame, "klikkeltél!");
                    }
                ;
                });
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    private void go() {

    }
}
