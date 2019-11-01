package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bodymass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1,num2,res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bodymass window = new Bodymass();
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
	public Bodymass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(138, 23, -61, 22);
		frame.getContentPane().add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(30, 11, 381, 29);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("BODY MASS INDEX");
		lblBodyMassIndex.setBounds(131, 11, 178, 14);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(30, 56, 381, 226);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("HEIGHTm):");
		lblHeightm.setBounds(26, 26, 73, 20);
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("WEIGHT(kg):");
		lblWeightkg.setBounds(26, 70, 73, 14);
		panel_1.add(lblWeightkg);
		
		textField = new JTextField();
		textField.setBounds(153, 26, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 67, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblBmi.setBounds(28, 115, 46, 14);
		panel_1.add(lblBmi);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(250, 117, 73, 14);
		panel_1.add(lblNewLabel);
		JLabel label = new JLabel("");
		label.setBounds(145, 117, 46, 14);
		panel_1.add(label);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res=(num2/(num1*num1));
				String ans=String.format("%.2f",res);
				label.setText(ans);
				if(res<18.5)
				{
					lblNewLabel.setText("under weight");
				}
				else if(res>18.5 && res<=24.9)
				{
					lblNewLabel.setText("normal weight");
				}
				else if(res>=24.9 && res<=29.9)
				{
					lblNewLabel.setText("over weight");
				}
				else 
				{
					lblNewLabel.setText("obese");
				}
				
			}
		});
		btnCalculate.setBounds(50, 167, 89, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				label.setText("");
			}
		});
		btnClear.setBounds(163, 167, 89, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(262, 167, 89, 23);
		panel_1.add(btnExit);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(30, 285, 381, 149);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		
		JButton button = new JButton(new ImageIcon("C:\\Users\\USER\\Downloads\\Chart.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button.setBounds(0, 0, 381, 149);
		panel_2.add(button);
	}
}
