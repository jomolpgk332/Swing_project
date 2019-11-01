package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kelvin {

	private JFrame frame;
	private JTextField textField;
	double num=0,num2,res,num1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kelvin window = new Kelvin();
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
	public Kelvin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(103, 53, 46, 14);
		frame.getContentPane().add(lblInput);
		
		textField = new JTextField();
		textField.setBounds(158, 50, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setBounds(25, 117, 46, 14);
		frame.getContentPane().add(lblInputScale);
		
		JLabel lblOutputScale = new JLabel("Output scale");
		lblOutputScale.setBounds(295, 117, 66, 14);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton rdbtnCelsius = new JRadioButton("Celsius");
		rdbtnCelsius.setBounds(25, 142, 109, 23);
		frame.getContentPane().add(rdbtnCelsius);
		
		JRadioButton rdbtnFarenheit = new JRadioButton("Farenheit");
		rdbtnFarenheit.setBounds(25, 171, 109, 23);
		frame.getContentPane().add(rdbtnFarenheit);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setBounds(25, 198, 109, 23);
		frame.getContentPane().add(rdbtnKelvin);
		
		JRadioButton rdbtnCelsius_1 = new JRadioButton("Celsius");
		rdbtnCelsius_1.setBounds(295, 138, 109, 23);
		frame.getContentPane().add(rdbtnCelsius_1);
		
		JRadioButton rdbtnFarenheit_1 = new JRadioButton("Farenheit");
		rdbtnFarenheit_1.setBounds(295, 164, 109, 23);
		frame.getContentPane().add(rdbtnFarenheit_1);
		
		JRadioButton rdbtnKelvin_1 = new JRadioButton("Kelvin");
		rdbtnKelvin_1.setBounds(295, 190, 109, 23);
		frame.getContentPane().add(rdbtnKelvin_1);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(158, 222, 46, 14);
		frame.getContentPane().add(lblOutput);
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				 res=((num1 - 32) * 5/9) ;
				String ans=String.format("%.2f",res);
				button.setText(ans);
						res =(5/9 * ( num1 - 32) + 273.15);//farenheit
				    	String an=String.format("%.2f",res);
				    	button.setText(ans);
				   
				    	res=(num1 + 273.15 );//kelvin
						String a=String.format("%.2f",res);
						button.setText(ans);
				    } 

		});
		button.setBounds(208, 218, 89, 23);
		frame.getContentPane().add(button);
	}
}
