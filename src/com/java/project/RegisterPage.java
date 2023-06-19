package com.java.project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	/**
	 * @wbp.nonvisual location=72,-31
	 */
	private final JLabel lblNewLabel_2_4 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\Junk-food.tttttjpg.jpg"));
		lblNewLabel.setBounds(258, 0, 314, 378);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("kaskrouti");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBackground(new Color(255, 128, 128));
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 26));
		lblNewLabel_1.setBounds(59, 0, 175, 46);
		contentPane.add(lblNewLabel_1);
		JLabel lblNewLabel_1_1 = new JLabel("Welcome Back");
		lblNewLabel_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(24, 48, 165, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sign up Page");
		lblNewLabel_1_2.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(24, 77, 231, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(24, 119, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(22, 136, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(22, 189, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(22, 239, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(151, 136, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(151, 192, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(151, 239, 86, 20);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Singn up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("") || textField.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("") || textField_4.getText().equals("") || textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Add all data...");
				}else {
					
					int  text_3,text; 
					String text_2,text_1, text_4,text_5;
					text   = Integer.parseInt(textField.getText());
					text_3 = Integer.parseInt(textField_3.getText());
					text_2 = textField_2.getText();
					text_1 = textField_1.getText();
					text_4 = textField_4.getText();
					text_5 = textField_5.getText();
					
					
					
					Register m = new Register(text,text_1,text_2,text_3,text_4,text_5);
					m.addOne(m);
					JOptionPane.showMessageDialog(null, "Add successfull");
					textField.setText("");textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");textField_5.setText("");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(19, 307, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Singn in");
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(140, 307, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Phone");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(151, 119, 77, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Name");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(24, 167, 77, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Adresse");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(151, 167, 77, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_5 = new JLabel("Password");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(24, 220, 77, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Job");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_5_1.setBounds(157, 220, 77, 14);
		contentPane.add(lblNewLabel_2_5_1);
	}
}
