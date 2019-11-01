package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Student {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
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
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1051, 692);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 443, 298);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(240, 5, 0, 0);
		panel.add(label);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setBounds(22, 39, 101, 21);
		panel.add(lblStudentid);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(22, 66, 72, 21);
		panel.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(22, 96, 59, 21);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(22, 120, 72, 21);
		panel.add(lblCourseCode);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				textField.setText("");
			}
		});
		textField.setBounds(127, 39, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 66, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 96, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBounds(22, 197, 72, 14);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(22, 228, 46, 14);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setBounds(22, 258, 46, 14);
		panel.add(lblRanking);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textField_4.setBounds(127, 194, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(127, 225, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(127, 255, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"111021A", "111022B", "111023C", "111024D", "111025E", "111026F"}));
		comboBox.setBounds(127, 120, 86, 20);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 166, 191, 0);
		panel.add(separator);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(240, 42, 46, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(240, 73, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(240, 101, 59, 11);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(240, 138, 72, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setBounds(240, 172, 72, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setBounds(240, 197, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(240, 228, 46, 14);
		panel.add(lblTamil);
		
		JLabel lblMalalyalam = new JLabel("Malalyalam");
		lblMalalyalam.setBounds(240, 258, 72, 14);
		panel.add(lblMalalyalam);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt)
			{
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                    evt.consume();
                }
			}
			});
		textField_3.setBounds(322, 39, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                      e.consume();
                }
			}
		});
		textField_7.setBounds(322, 66, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                    e.consume();
                } 
			}
		});
		textField_8.setBounds(322, 100, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                     e.consume();
                } 
			}
		});
		textField_9.setBounds(322, 135, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                     e.consume();
                }
			}
		});
		textField_10.setBounds(322, 166, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                   e.consume();
                }  
			}
		});
		textField_11.setBounds(322, 194, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                      e.consume();
                }
			}
		});
		textField_12.setBounds(322, 225, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                {
                     e.consume();
                } 
			}
		});
		textField_13.setBounds(322, 255, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 166, 191, 0);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(463, 11, 534, 298);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 11, 493, 251);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				}
			
		});
		btnClear.setBounds(195, 273, 89, 23);
		panel_1.add(btnClear);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 320, 987, 122);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Coursename", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(37, 24, 660, 65);
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 495, 987, 81);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						textField.getText(),
						(String)comboBox.getSelectedItem(),
						textField_3.getText(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						textField_10.getText(),
						textField_11.getText(),
						textField_12.getText(),
						textField_13.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
});
				double a[]=new double[20];
				a[0]=Double.parseDouble(textField_3.getText());
				a[1]=Double.parseDouble(textField_7.getText());
				a[2]=Double.parseDouble(textField_8.getText());
				a[3]=Double.parseDouble(textField_9.getText());
				a[4]=Double.parseDouble(textField_10.getText());
				a[5]=Double.parseDouble(textField_11.getText());
				a[6]=Double.parseDouble(textField_12.getText());
				a[7]=Double.parseDouble(textField_13.getText());
				a[8]=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7])/8;
				a[9]=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]);
				String avg=String.format("%.2f",a[8]);
				textField_5.setText(avg);
				String total=String.format("%.2f",a[9]);
				textField_4.setText(total);
				if(a[9]>=700) {
					textField_6.setText("1");
				}
				else if(a[9]>600 && a[9]<=700) {
					textField_6.setText("2");
				}
				else if(a[9]<600 && a[9]>500) {
					textField_6.setText("3");
				}
				else if(a[9]<500 && a[9]>400) {
					textField_6.setText("4");
				}
				else
				{
					textField_6.setText("5");
				}
				
}
		});
		btnNewButton.setBounds(76, 25, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int i=table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
				}
			}
		});
		btnNewButton_1.setBounds(246, 25, 102, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.append("Student record\n"
						+"Student name:\t\t"+textField.getText()+" "+textField_1.getText()
						+"\n============================================================"
						+"\nMath:\t\t"+textField_3.getText()
						+"\nEnglish:\t\t"+textField_7.getText()
						+"\nBiology:\t\t"+textField_8.getText()
						+"\nComputer:\t\t"+textField_9.getText()
						+"\nChemistry:\t\t"+textField_10.getText()
						+"\nPhysics:\t\t"+textField_11.getText()
						+"\nTamil:\t\t"+textField_12.getText()
						+"\nMalayalam:\t\t"+textField_13.getText()
						+"\n============================================================"
						+"\nTotal Score:\t\t"+textField_4.getText()
						+"\nAverage:\t\t"+textField_5.getText()
						+"\nRanking:\t\t"+textField_6.getText()
						);
			}
		});
		btnNewButton_2.setBounds(439, 25, 117, 23);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);	
				}
			}
		});
		btnNewButton_3.setBounds(621, 25, 102, 23);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
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
				textField_12.setText("");
				textField_13.setText("");
				
			}
		});
		btnNewButton_4.setBounds(787, 25, 102, 23);
		panel_3.add(btnNewButton_4);
	}
}
