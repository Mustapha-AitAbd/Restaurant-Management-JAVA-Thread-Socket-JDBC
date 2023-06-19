package com.java.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ft.socket.Client;
import ft.socket.Resultat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ServeurPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private String a,b,c,d,f,g,h;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServeurPage frame = new ServeurPage();
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
	public ServeurPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("Kaskrouti");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBounds(286, 11, 134, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\pizza (1).jpg"));
		lblNewLabel_1.setBounds(27, 47, 154, 79);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(37, 139, 57, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Price");
		lblNewLabel_2_1.setBounds(37, 161, 57, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Number");
		lblNewLabel_2_2.setBounds(37, 181, 57, 20);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pizza");
		lblNewLabel_3.setBounds(107, 142, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("40");
		lblNewLabel_4.setBounds(104, 164, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\tacos (1).jpg"));
		lblNewLabel_1_1.setBounds(209, 47, 154, 79);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Name");
		lblNewLabel_2_3.setBounds(219, 139, 57, 20);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tacos");
		lblNewLabel_3_1.setBounds(289, 142, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("40");
		lblNewLabel_4_1.setBounds(286, 164, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Price");
		lblNewLabel_2_1_1.setBounds(219, 161, 57, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Number");
		lblNewLabel_2_2_1.setBounds(219, 181, 57, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\sandwish (1).jpg"));
		lblNewLabel_1_2.setBounds(368, 47, 154, 79);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Name");
		lblNewLabel_2_4.setBounds(378, 139, 57, 20);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_2 = new JLabel("Sandwish");
		lblNewLabel_3_2.setBounds(448, 142, 46, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("40");
		lblNewLabel_4_2.setBounds(445, 164, 46, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Price");
		lblNewLabel_2_1_2.setBounds(378, 161, 57, 20);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Number");
		lblNewLabel_2_2_2.setBounds(378, 181, 57, 20);
		contentPane.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\coffee (1).jpg"));
		lblNewLabel_1_3.setBounds(27, 243, 154, 79);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_5 = new JLabel("Name");
		lblNewLabel_2_5.setBounds(37, 335, 57, 20);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_3 = new JLabel("Coffe");
		lblNewLabel_3_3.setBounds(107, 338, 46, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("40");
		lblNewLabel_4_3.setBounds(104, 360, 46, 14);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Price");
		lblNewLabel_2_1_3.setBounds(37, 357, 57, 20);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Number");
		lblNewLabel_2_2_3.setBounds(37, 377, 57, 20);
		contentPane.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Name");
		lblNewLabel_2_3_1.setBounds(219, 335, 57, 20);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\milk (1).jpg"));
		lblNewLabel_1_1_1.setBounds(209, 243, 154, 79);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("New label");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\jus.jpg"));
		lblNewLabel_1_2_1.setBounds(368, 243, 154, 79);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Name");
		lblNewLabel_2_4_1.setBounds(378, 335, 57, 20);
		contentPane.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Juice");
		lblNewLabel_3_2_1.setBounds(448, 338, 46, 14);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("40");
		lblNewLabel_4_2_1.setBounds(445, 360, 46, 14);
		contentPane.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Price");
		lblNewLabel_2_1_2_1.setBounds(378, 357, 57, 20);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Number");
		lblNewLabel_2_2_2_1.setBounds(378, 377, 57, 20);
		contentPane.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Number");
		lblNewLabel_2_2_1_1.setBounds(219, 377, 57, 20);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Price");
		lblNewLabel_2_1_1_1.setBounds(219, 357, 57, 20);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("40");
		lblNewLabel_4_1_1.setBounds(286, 360, 46, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		final JLabel lblNewLabel_3_1_1 = new JLabel("Milk");
		lblNewLabel_3_1_1.setBounds(289, 338, 46, 14);
		contentPane.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_6 = new JButton("Commander");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, a);
				Client p = new Client("p","p","p","p","p","p",a,b,c,d,f,g);
				try {
					Socket socketClient = new Socket("localhost", 1119);
					ObjectOutputStream sortie = new ObjectOutputStream(socketClient.getOutputStream());
					sortie.writeObject(p);
					//ObjectInputStream os = new ObjectInputStream(socketClient.getInputStream());
					//Resultat r = (Resultat)os.readObject();
					//textField_2.setText(r.getRst() + "");
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				
			}}
		});
		btnNewButton_6.setBounds(556, 395, 89, 36);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Annuler");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_7.setBounds(655, 395, 89, 36);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_5 = new JLabel("List");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_5.setBounds(628, 47, 62, 25);
		contentPane.add(lblNewLabel_5);
		
		final JLabel lblNewLabel01 = new JLabel("Nombre de Pizza demander:");
		lblNewLabel01.setBounds(556, 97, 188, 29);
		contentPane.add(lblNewLabel01);
		
		final JLabel lblNewLabel_6_1 = new JLabel("Nombre de Tacos demander :");
		lblNewLabel_6_1.setBounds(556, 142, 188, 29);
		contentPane.add(lblNewLabel_6_1);
		
		final JLabel lblNewLabel_6 = new JLabel("Nombre de sandwish demander :");
		lblNewLabel_6.setBounds(556, 195, 206, 14);
		contentPane.add(lblNewLabel_6);
		
		final JLabel lblNewLabel_7 = new JLabel("Nombre de Coffe demander :");
		lblNewLabel_7.setBounds(556, 232, 188, 14);
		contentPane.add(lblNewLabel_7);
		
		final JLabel lblNewLabel_8 = new JLabel("Nombre de Lait demander");
		lblNewLabel_8.setBounds(556, 275, 188, 14);
		contentPane.add(lblNewLabel_8);
		
		final JLabel lblNewLabel_9 = new JLabel("Nombre de jus demander :");
		lblNewLabel_9.setBounds(556, 313, 206, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Demande est Pr\u00EAt :");
		lblNewLabel_10.setBounds(556, 360, 100, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Non");
		lblNewLabel_11.setBounds(666, 360, 46, 14);
		contentPane.add(lblNewLabel_11);
		JButton btnNewButton = new JButton("Pizza");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a = textField.getText();
				lblNewLabel01.setText("Nombre de Pizza demander: "+ a);	
			}
		});
		btnNewButton.setBounds(47, 209, 89, 23);
		contentPane.add(btnNewButton);
		JButton btnTacos = new JButton("Tacos");
		btnTacos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 b = textField_1.getText();
				lblNewLabel_6_1.setText("Nombre de Tacos demander: "+ b);	
			}
			
		});
		JButton btnSandwish = new JButton("Sandwish");
		btnSandwish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 c = textField_2.getText();;
				lblNewLabel_6.setText("Nombre de Sandwish demander: "+ c);
			}
		});
		btnSandwish.setBounds(388, 212, 89, 23);
		contentPane.add(btnSandwish);
		
		JButton btnCoffe = new JButton("Coffe");
		btnCoffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 d = textField_3.getText();
				lblNewLabel_7.setText("Nombre de Coffe demander: "+ d);
			}
		});
		btnCoffe.setBounds(45, 408, 89, 23);
		contentPane.add(btnCoffe);
		
		JButton btnMilk = new JButton("Milk");
		btnMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 h = textField_4.getText();
				lblNewLabel_8.setText("Nombre de Lait demander: "+ h);
			}
		});
		btnMilk.setBounds(229, 408, 89, 23);
		contentPane.add(btnMilk);
		
		JButton btnJuice = new JButton("Juice");
		btnJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f = textField_5.getText();
				lblNewLabel_9.setText("Nombre de Jus demander: "+ f);
			}
		});
		btnJuice.setBounds(386, 408, 89, 23);
		contentPane.add(btnJuice);
		btnTacos.setBounds(229, 212, 89, 23);
		contentPane.add(btnTacos);
		
		textField = new JTextField();
		textField.setBounds(104, 181, 35, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(283, 181, 35, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(448, 181, 35, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 377, 35, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(286, 377, 35, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(442, 377, 35, 20);
		contentPane.add(textField_5);

	}
}
