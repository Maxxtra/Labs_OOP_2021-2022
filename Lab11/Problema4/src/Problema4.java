import javax.swing.*;
import java.awt.*;

public class Problema4 extends JFrame {
    JTree tree;
    JTable table;

    public Problema4(String path) {
        super("Titlu");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        tree = new JTree();
        table = new JTable();
    }



    public static void main(String[] args) {
        Problema4 test = new Problema4("/");
    }
}