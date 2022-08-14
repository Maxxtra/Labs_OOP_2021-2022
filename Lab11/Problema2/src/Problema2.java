import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Problema2 extends JFrame implements ListSelectionListener, ActionListener {
    JList<Book> lst;
    JTextField author;
    JTextField title;
    JButton btn;
    DefaultListModel<Book> el;

    public Problema2() {
        super("Carti");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.green);
        setLayout(new FlowLayout());

        el = new DefaultListModel<>();
        JScrollPane scrollPane = new JScrollPane();

        el.addElement(new Book("In padurea cu alune", " Mihai Creanga", ""));
        el.addElement(new Book("Amintirile de maine", " Sorinel Pustiu'", ""));
        el.addElement(new Book("Succesul unui prost", " Alex Deonise", ""));


        lst = new JList<>(el);
        scrollPane.setViewportView(lst);
        lst.setLayoutOrientation(JList.VERTICAL);
        lst.addListSelectionListener(this);
        add(scrollPane);

        JPanel p = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new BorderLayout());
        JLabel lb1 = new JLabel("Autor");
        JLabel lb2 = new JLabel("Titlu");

        p2.add(lb1, BorderLayout.PAGE_START);
        p2.add(lb2, BorderLayout.PAGE_END);

        author = new JTextField();
        author.setColumns(50);
        title = new JTextField();
        title.setColumns(50);
        p3.add(author,  BorderLayout.PAGE_START);
        p3.add(title, BorderLayout.PAGE_END);

        p.add(p2, BorderLayout.LINE_START);
        p.add(p3, BorderLayout.LINE_END);
        add(p);

        btn = new JButton("Sterge");
        btn.setEnabled(false);
        btn.addActionListener(this);
        add(btn);

        show();
        pack();
    }

    public static void main(String[] args) {
        Problema2 lst = new Problema2();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(lst.isSelectionEmpty()) {
            author.setText("");
            title.setText("");
            btn.setEnabled(false);
            return;
        }

        Book book = lst.getSelectedValue();

        btn.setEnabled(true);
        author.setText(book.getAuthor());
        title.setText(book.getName());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = lst.getSelectedIndex();
        btn.setEnabled(false);
        el.remove(index);
    }
}