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

public class timsonguyentotrongmang extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	public boolean snt (int n) {
		boolean kq = true;
		if ( n < 2 ) kq = false;
		else {
			for (int i = 2; i < n; i ++) 
				if ( n % i==0) kq = false;
		}
		return kq;
	}
	public String mangnt (String[]a) {
		String kq = "";
		for (String i : a)
			if (snt (Integer.parseInt(i))) kq = kq + "," + i;
		return kq;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timsonguyentotrongmang frame = new timsonguyentotrongmang();
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
	public timsonguyentotrongmang() {
		setTitle("Tìm số nguyên tố trong mảng");
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bài tập về mảng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(151, 21, 267, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mảng a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(34, 90, 82, 25);
		contentPane.add(lblNewLabel_1);
		
		a = new JTextField();
		a.setFont(new Font("Tahoma", Font.PLAIN, 20));
		a.setBounds(152, 90, 364, 26);
		contentPane.add(a);
		a.setColumns(10);
		
		JLabel kq = new JLabel("Kết quả:");
		kq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		kq.setBounds(34, 138, 510, 25);
		contentPane.add(kq);
		
		JButton btnNewButton = new JButton("Tìm các số nguyên tố");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kq.setText(mangnt(a.getText().split(",")));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(119, 211, 283, 33);
		contentPane.add(btnNewButton);
	}
}
