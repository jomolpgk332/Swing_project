package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketLabelling = new JLabel("TICKET LABELLING");
		lblTicketLabelling.setFont(new Font("Calibri", Font.BOLD, 29));
		lblTicketLabelling.setBounds(85, 11, 254, 36);
		frame.getContentPane().add(lblTicketLabelling);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 54, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(65, 51, 111, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(32, 104, 82, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton single = new JRadioButton("Single Ticket");
		single.setBounds(162, 104, 100, 23);
		frame.getContentPane().add(single);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(331, 104, 71, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBounds(32, 143, 82, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(162, 143, 60, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(231, 143, 61, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(331, 143, 61, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Kerala", "Tamil Nadu", "Delhi", "Bangalore"}));
		comboBox.setBounds(32, 190, 111, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Kerala", "Tamil Nadu", "Delhi", "Bangalore"}));
		comboBox_1.setBounds(169, 190, 123, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"3", "4", "5", "6", "7"}));
		comboBox_2.setBounds(331, 190, 60, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(32, 232, 82, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(32, 263, 82, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(32, 288, 82, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_1.setBounds(157, 229, 135, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(157, 260, 135, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(157, 285, 135, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//String Name=;
				textField_4.setText(textField.getText());
				String from=(String) comboBox.getSelectedItem();
				textField_5.setText(from);
				String to=(String) comboBox_1.getSelectedItem();
				textField_6.setText(to);
				Calendar timer=Calendar.getInstance();
				 timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				textField_8.setText(tTime.format(timer.getTime()));
				SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
				textField_7.setText(tdate.format(timer.getTime()));
				int n=1;
				String route="";
				n=1234+(int)(Math.random()*1567);
				route+=n+1234;
				textField_9.setText(route);
				//From.setText("Tamil Nadu");
				//textField_5.setText(String)comboBox.getSelectedItem();
				int num;
				String s="";
				num=1234;
				s=s+num+1234;
				textField_8.setText(s);
				textField_11.setText("Any");          
				 double temp=0;
	               double tot=0;
	                if(single.isSelected())
	                     temp=temp+500;
	                    else
	                     temp=temp+700;
	               
	                if(rdbtnAc.isSelected())
	                 temp=temp+500;
	                 
	                 
	                 else
	                 temp=temp+300;
	         
	                 if(rdbtnSleeper.isSelected())
	                  temp=temp+500;
	                  else
	                  temp=temp+300;
	                 String text = (String)comboBox_2.getSelectedItem();
	                 int b = Integer.parseInt(text);
	               
	                 temp=temp*b;
	                String ans= String.format("%.2f", temp);
	                 
	textField_2.setText(ans);

	if(rdbtnAc.isSelected())
	{
	textField_1.setText("200");
	tot=temp+200;
	String an= String.format("%.2f", tot);
	textField_3.setText(an);
	textField_10.setText(an);

	}
	else {
	textField_1.setText("100");
	tot=temp+100;
	String an= String.format("%.2f", tot);
	textField_3.setText(an);
	textField_10.setText(an);}	         
			}
		});
		btnTotal.setBounds(54, 335, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
			}
		});
		btnReset.setBounds(185, 335, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(296, 335, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(432, 104, 426, 269);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(21, 27, 69, 14);
		panel.add(lblName_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 24, 117, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(21, 93, 46, 14);
		panel.add(lblFrom);
		
		textField_5 = new JTextField();
		textField_5.setBounds(102, 90, 117, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(21, 127, 69, 20);
		panel.add(lblTo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(102, 127, 117, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(21, 158, 46, 14);
		panel.add(lblDate);
		
		textField_7 = new JTextField();
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_7.setBounds(102, 158, 117, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(21, 205, 46, 14);
		panel.add(lblTime);
		
		textField_8 = new JTextField();
		textField_8.setBounds(102, 202, 117, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(274, 64, 85, 14);
		panel.add(lblTicketNo);
		
		textField_9 = new JTextField();
		textField_9.setBounds(274, 87, 117, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(274, 118, 46, 14);
		panel.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setBounds(274, 139, 117, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRoutes = new JLabel("Routes");
		lblRoutes.setBounds(274, 170, 46, 14);
		panel.add(lblRoutes);
		
		textField_11 = new JTextField();
		textField_11.setBounds(274, 202, 117, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table_1.getModel();
				model.addRow(new String[] {
						textField.getText(),
						textField_9.getText(),
						textField_5.getText(),
						textField_6.getText(),
						(String)comboBox_2.getSelectedItem(),
						textField_8.getText(),
						textField_7.getText(),
						textField_10.getText(),
						//(String)comboBox.getSelectedItem(),
						//(String)comboBox_1.getSelectedItem(),
						
						
						
						
						
						
						//textField_11.getText(),
});
				
	}
		});
		btnConfirm.setBounds(205, 233, 89, 23);
		panel.add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-116, 411, 974, 74);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(73, 54, 39, 0);
		panel_1.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name","Booking No","From","To","No of Seats","Time","Date","AC/Non AC","Price"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(160, 11, 806, 32);
		panel_1.add(table_1);
	}
}
