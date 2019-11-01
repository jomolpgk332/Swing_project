package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Weightconverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;double result,result2;
	
	private final JTextField textField_2 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weightconverter window = new Weightconverter();
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
	public Weightconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_2.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHeight.setBounds(43, 121, 46, 17);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeight.setBounds(43, 172, 46, 17);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsMeasurement.setBounds(70, 85, 141, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMetric.setBounds(276, 85, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		textField = new JTextField();
		textField.setBounds(125, 121, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 172, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(276, 121, 46, 17);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(276, 172, 46, 20);
		frame.getContentPane().add(label_2);
		
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				result=num1/3.371;
				 result2 =num2/2.215;
				ans=String.format("%.2f",result);
				
				label_1.setText(ans);
				ans=String.format("%.2f",result2);
				label_2.setText(ans);
				
				//textField_3.setText(result);
				//textField_4.setText(result);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOk.setBounds(58, 228, 89, 23);
		frame.getContentPane().add(btnOk);
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(193, 228, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHelp.setBounds(31, 40, 89, 23);
		frame.getContentPane().add(btnHelp);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAbout.setBounds(172, 40, 89, 23);
		frame.getContentPane().add(btnAbout);
		
		JTextArea txtrHeightAndWeight = new JTextArea();
		txtrHeightAndWeight.setFont(new Font("Elephant", Font.ITALIC, 16));
		txtrHeightAndWeight.setBackground(Color.BLUE);
		txtrHeightAndWeight.setForeground(Color.DARK_GRAY);
		txtrHeightAndWeight.setText("Height and Weight Converter                                                    ");
		txtrHeightAndWeight.setBounds(23, 11, 365, 22);
		frame.getContentPane().add(txtrHeightAndWeight);
		
		
	}
}





































