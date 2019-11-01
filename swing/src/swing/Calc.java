package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;double result;
	String op;
	String ans;
	double US=300.00;
	double INDIA=100.00;
	double CHINA=250.00;
	double IRAN=300.00;
	double BHUTAN=350.00;
	
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 262, 317);
				textField.setBounds(0,0,245,25);
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 679, 317);
				textField.setBounds(0,0,660,25);
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmUnitCoversion = new JMenuItem("Unit Coversion");
		mntmUnitCoversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 974, 317);
			}
		});
		mnFile.add(mntmUnitCoversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);	
				}
			}
		});
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 650, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 53, 52, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b="";
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnNewButton_1.setBounds(69, 53, 47, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			
			}
		});
		btnNewButton_2.setBounds(126, 53, 47, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+/-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=(num1-1.800);
	                textField.setText(String.valueOf(num1));
				
			}
		});
		btnNewButton_3.setBounds(183, 53, 55, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("sqrt");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
				 num1=Math.sqrt(num1);
	                textField.setText(String.valueOf(num1));
				
			}
		});
		btnNewButton_4.setBounds(250, 53, 55, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 =    new JButton("L");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				double res=Math.log(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnNewButton_5.setBounds(315, 53, 93, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sin");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_6.setBounds(418, 53, 72, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Sinh");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_7.setBounds(500, 53, 78, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Mod");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");	
		op="%";
			}
		});
		btnNewButton_8.setBounds(588, 53, 72, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number6=textField.getText()+btnNewButton_9.getText();
				textField.setText(Number6);
				
			}
		});
		btnNewButton_9.setBounds(10, 87, 52, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("4");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number3=textField.getText()+btnNewButton_10.getText();
				textField.setText(Number3);
			}
		});
		btnNewButton_10.setBounds(10, 121, 52, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("1");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_11.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_11.setBounds(10, 155, 52, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number9=textField.getText()+btnNewButton_12.getText();
				textField.setText(Number9);
			}
		});
		btnNewButton_12.setBounds(12, 189, 104, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("8");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number7=textField.getText()+btnNewButton_13.getText();
				textField.setText(Number7);
			}
		});
		btnNewButton_13.setBounds(67, 87, 47, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("5");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number4=textField.getText()+btnNewButton_14.getText();
				textField.setText(Number4);
			}
		});
		btnNewButton_14.setBounds(67, 121, 47, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("2");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number1=textField.getText()+btnNewButton_15.getText();
				textField.setText(Number1);
			}
		});
		btnNewButton_15.setBounds(67, 154, 47, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("9");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number8=textField.getText()+btnNewButton_17.getText();
				textField.setText(Number8);
			}
		});
		btnNewButton_17.setBounds(126, 87, 47, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("6");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number5=textField.getText()+btnNewButton_18.getText();
				textField.setText(Number5);
			}
		});
		btnNewButton_18.setBounds(126, 120, 47, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("3");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number2=textField.getText()+btnNewButton_19.getText();
				textField.setText(Number2);
			}
		});
		btnNewButton_19.setBounds(126, 154, 47, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton(".");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_20.setBounds(126, 188, 47, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("/");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");	
		op="/";
			}
		});
		btnNewButton_21.setBounds(183, 87, 55, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("*");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");	
		op="*";
			}
		});
		btnNewButton_22.setBounds(183, 120, 55, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_24 = new JButton("+");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");	
		op="+";
				
				
			}
		});
		btnNewButton_24.setBounds(183, 188, 55, 23);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("mod");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");	
		op="%";
				
				
			}
		});
		btnNewButton_25.setBounds(250, 87, 55, 23);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("1/x");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                result=(1/num1);
	                textField.setText(String.valueOf(result));
				
			}
		});
		btnNewButton_26.setBounds(250, 121, 55, 23);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_28 = new JButton("=");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
					
				}
				
				num2=Double.parseDouble(textField.getText());
				if(op=="-") {
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
					
				}
				
				num2=Double.parseDouble(textField.getText());
				if(op=="*") {
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
					
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="/") {
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
					
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="%") {
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
					
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="cbr") {
					result=((num1/num2)*100);
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				 /*num2=Double.parseDouble(textField.getText());
				 if(op=="x^y") {
						result=num1%num2;
						ans=String.format(result);
						
						textField.setText(ans);
				 }*/
			}
		});
		btnNewButton_28.setBounds(260, 155, 41, 57);
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("pie");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=(3.14*num1);
	                textField.setText(String.valueOf(num1));
				
			}
		});
		btnNewButton_29.setBounds(315, 87, 93, 23);
		frame.getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("x^y");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.pow(num1,num2);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_30.setBounds(315, 121, 93, 31);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("x^2");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.pow(num1,2);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_31.setBounds(315, 189, 93, 23);
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("x^3");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.pow(num1,3);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_32.setBounds(315, 155, 93, 23);
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Cos");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cos(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_33.setBounds(418, 87, 72, 23);
		frame.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("Cosh");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_34.setBounds(500, 87, 78, 23);
		frame.getContentPane().add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("Lnx");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				double res=Math.log((num1)/10);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnNewButton_35.setBounds(588, 87, 72, 23);
		frame.getContentPane().add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("Tan");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.tan(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_36.setBounds(418, 121, 72, 23);
		frame.getContentPane().add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton("Cbr");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num2=Double.parseDouble(textField.getText());
                result=((num1/num2)*100);
                textField.setText(String.valueOf(result));
			}
		});
		btnNewButton_37.setBounds(418, 155, 72, 23);
		frame.getContentPane().add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("Bin");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer .toBinaryString(a));
			}
		});
		btnNewButton_38.setBounds(418, 189, 72, 23);
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("Tanh");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_39.setBounds(500, 121, 78, 23);
		frame.getContentPane().add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("Rund");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_40.setBounds(500, 155, 78, 23);
		frame.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("Hex");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnNewButton_41.setBounds(500, 189, 78, 23);
		frame.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("C");
		btnNewButton_42.setBounds(588, 121, 72, 23);
		frame.getContentPane().add(btnNewButton_42);
		
		JButton btnNewButton_43 = new JButton("2*pie");
		btnNewButton_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=(2*(3.14*num1));
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_43.setBounds(588, 155, 72, 23);
		frame.getContentPane().add(btnNewButton_43);
		
		JButton btnNewButton_44 = new JButton("Oc");
		btnNewButton_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnNewButton_44.setBounds(588, 189, 72, 23);
		frame.getContentPane().add(btnNewButton_44);
		
		JButton btnNewButton_23 = new JButton("-");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");	
		op="-";
			}
		});
		btnNewButton_23.setBounds(183, 154, 55, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		JPanel panel = new JPanel();
		panel.setBounds(679, 22, 264, 213);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setBounds(70, 11, 148, 29);
		panel.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "INDIA", "CHINA", "IRAN", "BHUTAN"}));
		comboBox.setBounds(80, 40, 115, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 69, 131, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(80, 100, 99, 14);
		panel.add(label);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("US"));
				{
					String c=String.format("Rs%.2f",bp*US);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("INDIA"));
				{
					String c=String.format("Rs%.2f",bp*INDIA);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("CHINA"));
				{
					String c=String.format("Rs%.2f",bp*CHINA);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("IRAN"));
				{
					String c=String.format("Rs%.2f",bp*IRAN);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("BHUTAN"));
				{
					String c=String.format("Rs%.2f",bp*INDIA);
					label.setText(c);
				}
				
			}
		});
		btnConvert.setBounds(27, 151, 89, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText("");
				label.setText("");
			}
			
		});
		btnClear.setBounds(154, 151, 89, 23);
		panel.add(btnClear);
	}
}
