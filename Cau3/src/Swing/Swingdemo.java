package Swing;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Swingdemo extends JFrame implements ActionListener {
	//Khai báo các đối tượng
	JLabel lb1, lb2, ketQua;
	JTextField tf1;
	JButton btnTinh, btnXoa;
	GridLayout gridLayout;
	
	public Swingdemo() {
		//Khởi tạo các đối tượng
		lb1 = new JLabel("Nhập số nguyên");
		tf1 = new JTextField();
		lb2 = new JLabel("Kết Quả");
		ketQua = new JLabel();
		btnTinh = new JButton ("Tính");
		btnXoa = new JButton ("Xóa");
		//Tạo frame
		gridLayout = new GridLayout(0,2,1,1);
		setTitle("Chương trình tính giai thừa");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (400,200);
		setLocationRelativeTo (null);
		setVisible (true);
		setLayout (gridLayout);
		//Thêm các đối tượng vào frame
		add(lb1);
		add(tf1);
		add(lb2);
		add(ketQua);
		add(btnTinh);
		add(btnXoa);
		btnTinh.addActionListener (this);
		btnXoa.addActionListener (this);
	}
	//Xử lý sự kiện cho các Button
	@Override 
//	public void actionPerformed(ActionEvent e) {  // Tính giai thừa
//		int number = Integer.parseInt(tf1.getText().trim());
//		
//		if(e.getSource() == btnTinh) {
//			int tich = 1;
//			for(int i = 1; i <= number; i++) {
//				tich *= i;			
//			}
//			ketQua.setText(String.valueOf(tich));
//		}
//		if(e.getSource() == btnXoa) {
//			tf1.setText("");
//			tf1.requestFocus();
//		}
//	}
//	public void actionPerformed(ActionEvent e) {  // xuất kết quả ra màn hình tổng các phần tử đã nhập
//		String line = tf1.getText().trim();
//		String[] listNumbers = line.split(",");
//		
//		if(e.getSource() == btnTinh) {
//			int tong = 0;
//			for(int i = 0; i < listNumbers.length; i++) {
//				tong += Integer.parseInt(listNumbers[i]);
//			}
//			ketQua.setText(String.valueOf(tong));
//		}
//		if(e.getSource() == btnXoa) {
//			tf1.setText("");
//			tf1.requestFocus();
//		}
//	}
	public void actionPerformed(ActionEvent e) {  // Tổng các phần tử chẳn, nếu là lẻ thì thay x % 2 != 0
		String line = tf1.getText().trim();
		String[] listNumbers = line.split(",");
		
		if(e.getSource() == btnTinh) {
			int tong = 0;
			for(int i = 0; i < listNumbers.length; i++) {
				int x = Integer.parseInt(listNumbers[i]);
				if ( x % 2 == 0) {
					tong += x;
				}
			}
			ketQua.setText(String.valueOf(tong));
		}
		if(e.getSource() == btnXoa) {
			tf1.setText("");
			tf1.requestFocus();
		}
	}
	public static void main(String [] args) {
		Swingdemo lc = new Swingdemo();
	}

}
