package app;

import javax.swing.JFrame;

public class ClassExtendJFrame extends JFrame {

    private JFrame frame;

    //Nincs paramétere - ?
    public ClassExtendJFrame() {
        frame = new JFrame("ClassExtends JFrame");
        frame.setSize(320, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //ha nincs adattag, this egy már egy JFramre hivatkozik, mert öröklödött
        /* this.setTitle("");
        this.setSize(320, 240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); */
    }

}
