package com.java.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 16));
		setTitle("Welcome to Kaskrouti");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\Junk-food.tttttjpg.jpg"));
		lblNewLabel.setBounds(284, 0, 542, 391);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kaskrouti");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBackground(new Color(255, 128, 128));
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 26));
		lblNewLabel_1.setBounds(59, 0, 175, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Welcome Back");
		lblNewLabel_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(24, 48, 165, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sign in with Name ande Password");
		lblNewLabel_1_2.setFont(new Font("SimSun", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(24, 77, 231, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Name");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setBackground(Color.GRAY);
		lblNewLabel_1_3.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(24, 119, 76, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(23, 144, 166, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Password");
		lblNewLabel_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_3_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(24, 188, 89, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 213, 165, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Singn in");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("") || textField.getText().equals("") || textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Print  all data...");
				}else { 
					String text_2,text_1, text;
					text   = textField.getText();
					text_1 = textField_1.getText();
					text_2 = textField_2.getText();
					User m = new User(text,text_1,text_2);
					User c =m.getOne(m);
					if(c.getName() != null) {
					JOptionPane.showMessageDialog(null, "exist");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					}else {
						JOptionPane.showMessageDialog(null, c.getName());
					}
				}
			}
			
		});
		btnNewButton.setBounds(24, 334, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(145, 334, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Job");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_2.setBounds(24, 266, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(24, 291, 165, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
