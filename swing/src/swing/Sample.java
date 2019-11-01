package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Sample {
	
	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame=new JFrame("Login Page");

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 454, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Andalus", Font.PLAIN, 10));
		txtUsername.setText("Username");
		txtUsername.setBounds(148, 144, 100, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Andalus", Font.PLAIN, 10));
		txtPassword.setText("Password");
		txtPassword.setBounds(148, 192, 100, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new  JButton(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\ee.jpg"));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBounds(117, 320, 160, 60);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember Me");
		chckbxRememberMe.setFont(new Font("Gisha", Font.PLAIN, 15));
		chckbxRememberMe.setBounds(239, 221, 144, 23);
		frame.getContentPane().add(chckbxRememberMe);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Serif", Font.PLAIN, 17));
		lblUserName.setBounds(60, 143, 79, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 17));
		lblPassword.setBounds(60, 186, 79, 25);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\tt.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setBounds(117, 251, 160, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\dd.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(133, 31, 115, 102);
		frame.getContentPane().add(btnNewButton_2);
	}
}
