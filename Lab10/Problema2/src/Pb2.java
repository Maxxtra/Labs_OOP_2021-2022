import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.io.File;
import java.io.*;
import java.util.*;

public class Pb2 extends JFrame implements ActionListener {
    private JButton btn;
    private JRadioButton ansLbl1;
    private JRadioButton ansLbl2;
    private JRadioButton ansLbl3;
    private JRadioButton ansLbl4;
    private JTextField question;

    public Pb2(String title, String ans1, String ans2, String ans3, String ans4, String ques) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.gray);
        setLayout(new FlowLayout());

        question = new JTextField(ques);
        question.setEnabled(false);
        add(question);

        ButtonGroup G = new ButtonGroup();
        ansLbl1 = new JRadioButton(ans1);
        ansLbl2 = new JRadioButton(ans2);
        ansLbl3 = new JRadioButton(ans3);
        ansLbl4 = new JRadioButton(ans4);
        ansLbl1.addActionListener(this);
        ansLbl2.addActionListener(this);
        ansLbl3.addActionListener(this);
        ansLbl4.addActionListener(this);

        G.add(ansLbl1);
        G.add(ansLbl2);
        G.add(ansLbl3);
        G.add(ansLbl4);
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
        Pb2 test;

        if (vct.size() >= 5) {
            test = new Pb2("Title", vct.get(1), vct.get(2), vct.get(3), vct.get(4), vct.get(0));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JRadioButton ) {
            System.out.println("DA");
            if (((JRadioButton) e.getSource()).isSelected()) {
                btn.setEnabled(true);
            }
        } else if (e.getSource() instanceof JButton) {
            if (ansLbl1.isSelected()) {
                ansLbl1.setBackground(Color.green);
            } else {
                ansLbl1.setBackground(Color.red);
            }
        }


    }
}