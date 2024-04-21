package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ptb1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField soa;
	private JTextField sob;
	public String GiaiPTbac1(int a , int b) {
		String kq = "";
		if (a==0) {
			if(b==0) kq = "Pt vo so nghiem";
			else kq = "Pt vo nghiem";
		}
		else kq = "Pt co nghiem la: " + Integer.toString(-b/a);
		return kq;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ptb1 frame = new ptb1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ptb1() {
		setTitle("Giai pt bac 1");
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giai pt bac 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(133, 10, 155, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhap a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(29, 69, 97, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhap b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(29, 113, 97, 34);
		contentPane.add(lblNewLabel_1_1);
		
		soa = new JTextField();
		soa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		soa.setBounds(133, 74, 133, 34);
		contentPane.add(soa);
		soa.setColumns(10);
		
		sob = new JTextField();
		sob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sob.setColumns(10);
		sob.setBounds(133, 118, 133, 34);
		contentPane.add(sob);
		
		JLabel kq = new JLabel("Ket qua");
		kq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		kq.setBounds(29, 192, 397, 46);
		contentPane.add(kq);
		
		JButton btnNewButton = new JButton("Giai");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(soa.getText());
				int b = Integer.parseInt(sob.getText());
				kq.setText("Ket qua: " + GiaiPTbac1(a, b));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(317, 74, 109, 62);
		contentPane.add(btnNewButton);
	}
}
