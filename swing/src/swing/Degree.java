package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Degree {

	private JFrame frame;
	private JTextField textField;
double C,F;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Degree window = new Degree();
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
	public Degree() {
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
		
		JLabel lblDegrees = new JLabel("DEGREES");
		lblDegrees.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 15));
		lblDegrees.setBounds(85, 44, 69, 24);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(164, 46, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 15));
		lblResult.setBounds(68, 112, 63, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(164, 112, 86, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnToCelsius = new JButton("TO CELSIUS");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double	num1=Double.parseDouble(textField.getText());
				double res=((num1 - 32) * 5/9) ;
				String ans=String.format("%.2f",res);
				lblNewLabel.setText(ans);
}
		});
		btnToCelsius.setBounds(68, 176, 117, 23);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFarenheit = new JButton("TO FARENHEIT");
		btnToFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double	num1=Double.parseDouble(textField.getText());
			double res=((num1*9/5) + 32);
			String ans=String.format("%.2f",res);
			lblNewLabel.setText(ans);

				
			}
		});
		btnToFarenheit.setBounds(220, 176, 143, 23);
		frame.getContentPane().add(btnToFarenheit);
	}

}
