package Swing;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class tong2songuyen extends JFrame implements ActionListener {

    private JTextField numField1, numField2, resultField;
    private JButton calculateButton, clearButton;

    public tong2songuyen() {
        setTitle("Tổng 2 số nguyên");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        JLabel numLabel1 = new JLabel("Nhập số thứ nhất:");
        add(numLabel1);
        numField1 = new JTextField();
        add(numField1);

        JLabel numLabel2 = new JLabel("Nhập số thứ hai:");
        add(numLabel2);
        numField2 = new JTextField();
        add(numField2);

        JLabel resultLabel = new JLabel("Kết quả:");
        add(resultLabel);
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        calculateButton = new JButton("Tính");
        add(calculateButton);
        calculateButton.addActionListener(this);

        clearButton = new JButton("Xóa");
        add(clearButton);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());
                int result = num1 + num2;
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            numField1.setText("");
            numField2.setText("");
            resultField.setText("");
        }
    }

    public static void main(String[] args) {
        new tong2songuyen();
    }
}
