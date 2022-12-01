package Lab6;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Calculator {

    public static void createAndShowGUI() {
        ActionListener myActionListener = e -> System.out.println("[ActionListener] Button = "+e.getActionCommand());

        JFrame jf = new JFrame("Kalkulator");
        jf.setVisible(true);
        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        jf.getContentPane().add(jp);

        Dimension dm = new Dimension(400, 300);
        jf.pack();
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setPreferredSize(dm);
        jp.setMaximumSize(dm);
        jp.setMinimumSize(dm);
        jf.setMaximumSize(dm);
        jf.setMinimumSize(dm);
        jp.setPreferredSize(dm);

        JTextField tf = new JTextField(4);
        tf.setEditable(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setMaximumSize(new Dimension(400, 20));
        tf.setMargin(new Insets(0,0,0, 10));
        tf.setText("0");
        tf.setFont(new Font("Arial", Font.BOLD, 17));

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("+");
        JButton jb5 = new JButton("4");
        JButton jb6 = new JButton("5");
        JButton jb7 = new JButton("6");
        JButton jb8 = new JButton("-");
        JButton jb9 = new JButton("7");
        JButton jb10 = new JButton("8");
        JButton jb11 = new JButton("9");
        JButton jb12 = new JButton("*");
        JButton jb13 = new JButton("0");
        JButton jb14 = new JButton("=");
        JButton jb15 = new JButton("C");
        JButton jb16 = new JButton("/");

        for (JButton jButton : Arrays.asList(jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15, jb16)) {
            jButton.addActionListener(myActionListener);
        }
        for (JPanel jPanel : Arrays.asList(jp1, jp2, jp3, jp4)) {
            jPanel.setLayout(new GridLayout(1, 0, 10, 15));
        }

        jp.setLayout(new GridLayout(5, 0, 5, 15));
        jp.setBorder(new EmptyBorder(10, 10, 10,10));
        jp.add(tf);

        for (JButton jButton : Arrays.asList(jb1, jb2, jb3, jb4)) {
            jp1.add(jButton);
        }
        for (JButton jButton : Arrays.asList(jb5, jb6, jb7, jb8)) {
            jp2.add(jButton);
        }
        for (JButton jButton : Arrays.asList(jb9, jb10, jb11, jb12)) {
            jp3.add(jButton);
        }
        for (JButton jButton : Arrays.asList(jb13, jb14, jb15, jb16)) {
            jp4.add(jButton);
        }
        for (JPanel jPanel : Arrays.asList(jp1, jp2, jp3, jp4)) {
            jp.add(jPanel);
        }

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Calculator::createAndShowGUI);
    }

}

