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

public class ptb2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField soa;
	private JTextField sob;
	private JTextField soc;
	public String gptb2(int a ,int b , int c) {
		String kq = "";
		int denta = b*b-4*a*c;
		if(denta < 0) kq = "Phương  trình vô nghiệm";
		if(denta == 0) kq = "Phương trình có nghiệm kép: " + Integer.toString(-b/2*a);
		if(denta > 0) {
			double x1 = (-b+Math.sqrt(denta))/(2*a);
			double x2 = (-b-Math.sqrt(denta))/(2*a);
			kq = "x1 = " + Double.toString(x1) + ", x2 =" + Double.toString(x2); 
		}
		return kq;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ptb2 frame = new ptb2();
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
	public ptb2() {
		setTitle("Giải pt bậc 2");
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nhan1 = new JLabel("Giải pt bậc 2");
		nhan1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nhan1.setBounds(139, 10, 154, 58);
		contentPane.add(nhan1);
		
		JLabel nhan2 = new JLabel("Nhập a:");
		nhan2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nhan2.setBounds(26, 69, 83, 35);
		contentPane.add(nhan2);
		
		soa = new JTextField();
		soa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		soa.setBounds(127, 69, 96, 30);
		contentPane.add(soa);
		soa.setColumns(10);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhpB.setBounds(26, 114, 83, 35);
		contentPane.add(lblNhpB);
		
		sob = new JTextField();
		sob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sob.setColumns(10);
		sob.setBounds(127, 114, 96, 30);
		contentPane.add(sob);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhpC.setBounds(26, 168, 83, 35);
		contentPane.add(lblNhpC);
		
		soc = new JTextField();
		soc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		soc.setColumns(10);
		soc.setBounds(127, 168, 96, 30);
		contentPane.add(soc);
		
		JLabel kq = new JLabel("Kết quả:");
		kq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		kq.setBounds(26, 218, 400, 35);
		contentPane.add(kq);
		
		JButton btnNewButton = new JButton("Giải");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(soa.getText());
				int b = Integer.parseInt(sob.getText());
				int c = Integer.parseInt(soc.getText());
				kq.setText(gptb2(a,b,c));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(309, 100, 85, 35);
		contentPane.add(btnNewButton);
	}
}