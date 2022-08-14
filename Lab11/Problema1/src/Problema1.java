import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Problema1 extends JFrame {

        public Problema1() {
        super("Carti");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.green);
        setLayout(new FlowLayout());

        Vector<Book> el = new Vector<>();

        JScrollPane scrollPane = new JScrollPane();

        el.add(new Book("In padurea cu alune", " Mihai Creanga", ""));
        el.add(new Book("Amintirile de maine", " Sorinel Pustiu'", ""));
        el.add(new Book("Succesul unui prost", " Alex Deonise", ""));


        JList<Book> lst = new JList<>(el);
        scrollPane.setViewportView(lst);
        lst.setLayoutOrientation(JList.VERTICAL);
        add(scrollPane);

        show();
        pack();
        }

       public static void main(String[] args) {
        Problema1 lst = new Problema1();
        }
}