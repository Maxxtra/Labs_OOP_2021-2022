import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Pb3 extends JFrame implements ActionListener, ItemListener {
    private JButton btn;
    private JCheckBox ansLbl1;
    private JCheckBox ansLbl2;
    private JCheckBox ansLbl3;
    private JCheckBox ansLbl4;
    private JTextField question;
    private Integer counter;

    public Pb3(String title, String ans1, String ans2, String ans3, String ans4, String ques) {
        super(title);
        counter = 0;
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.gray);
        setLayout(new FlowLayout());

        question = new JTextField(ques);
        question.setEnabled(false);
        add(question);

        ansLbl1 = new JCheckBox(ans1);
        ansLbl2 = new JCheckBox(ans2);
        ansLbl3 = new JCheckBox(ans3);
        ansLbl4 = new JCheckBox(ans4);
        ansLbl1.addItemListener(this);
        ansLbl2.addItemListener(this);
        ansLbl3.addItemListener(this);
        ansLbl4.addItemListener(this);


        add(ansLbl1);
        add(ansLbl2);
        add(ansLbl3);
        add(ansLbl4);

        btn = new JButton("Click");
        btn.addActionListener(this);
        btn.setEnabled(false);
        add(btn);

        show();
        pack();
    }

    public static void main(String[] args) {
        Vector<String> vct = new Vector<>();

        try {
            File obj = new File("C:\\Users\\alex_\\Desktop\\ACS\\Anul2\\Sem1\\POO\\Lab10\\Problema2\\question.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                vct.add(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
        Pb3 test;

        if (vct.size() >= 5) {
            test = new Pb3("Title", vct.get(1), vct.get(2), vct.get(3), vct.get(4), vct.get(0));
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if (ansLbl1.isSelected() && ansLbl2.isSelected()) {
                ansLbl1.setBackground(Color.green);
                ansLbl2.setBackground(Color.green);
            } else {
                ansLbl1.setBackground(Color.red);
                ansLbl2.setBackground(Color.red);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            counter ++;
            btn.setEnabled(true);
        }
    }
}