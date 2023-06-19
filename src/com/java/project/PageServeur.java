package com.java.project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageServeur extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageServeur frame = new PageServeur();
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
	public PageServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kaskrouti");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(306, 0, 146, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\pizza (1).jpg"));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(10, 44, 154, 79);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(20, 134, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Price");
		lblNewLabel_2_1.setBounds(20, 153, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Number");
		lblNewLabel_2_2.setBounds(20, 173, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		final JSpinner spinner = new JSpinner();
		spinner.setBounds(88, 170, 30, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_2_4 = new JLabel("40");
		lblNewLabel_2_4.setBounds(88, 153, 46, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_3 = new JLabel("Pizza");
		lblNewLabel_2_3.setBounds(88, 134, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\tacos (1).jpg"));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1.setBounds(174, 44, 154, 79);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("Name");
		lblNewLabel_2_5.setBounds(173, 134, 46, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Tacos");
		lblNewLabel_2_3_1.setBounds(229, 134, 46, 14);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("50");
		lblNewLabel_2_4_1.setBounds(229, 153, 46, 14);
		contentPane.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Price");
		lblNewLabel_2_1_1.setBounds(174, 153, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Number");
		lblNewLabel_2_2_1.setBounds(174, 173, 46, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(229, 170, 30, 20);
		contentPane.add(spinner_3);
		
		JButton btnTacos = new JButton("Tacos");
		btnTacos.setBounds(186, 198, 89, 23);
		contentPane.add(btnTacos);
		
		JButton btnNewButton = new JButton("Pizza");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = (int) spinner.getValue();
				lblNewLabel_4.setText();
				
			}
		});
		btnNewButton.setBounds(30, 198, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_6 = new JLabel("Name");
		lblNewLabel_2_6.setBounds(350, 134, 46, 14);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\sandwish (1).jpg"));
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setBackground(SystemColor.menu);
		lblNewLabel_1_2.setBounds(340, 44, 154, 79);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Sandwish");
		lblNewLabel_2_3_2.setBounds(418, 134, 46, 14);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("40");
		lblNewLabel_2_4_2.setBounds(418, 153, 46, 14);
		contentPane.add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Price");
		lblNewLabel_2_1_2.setBounds(350, 153, 46, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Number");
		lblNewLabel_2_2_2.setBounds(350, 173, 46, 14);
		contentPane.add(lblNewLabel_2_2_2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(418, 170, 30, 20);
		contentPane.add(spinner_2);
		
		JButton btnSandwish = new JButton("Sandwish");
		btnSandwish.setBounds(350, 195, 89, 23);
		contentPane.add(btnSandwish);
		
		JLabel lblNewLabel_1_5 = new JLabel("New label");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\jus.jpg"));
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setBackground(SystemColor.menu);
		lblNewLabel_1_5.setBounds(350, 232, 154, 79);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_9 = new JLabel("Name");
		lblNewLabel_2_9.setBounds(360, 322, 46, 14);
		contentPane.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_3_5 = new JLabel("Orange juice");
		lblNewLabel_2_3_5.setBounds(428, 322, 66, 14);
		contentPane.add(lblNewLabel_2_3_5);
		
		JLabel lblNewLabel_2_4_5 = new JLabel("40");
		lblNewLabel_2_4_5.setBounds(428, 341, 46, 14);
		contentPane.add(lblNewLabel_2_4_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Price");
		lblNewLabel_2_1_5.setBounds(360, 341, 46, 14);
		contentPane.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("Number");
		lblNewLabel_2_2_5.setBounds(360, 361, 46, 14);
		contentPane.add(lblNewLabel_2_2_5);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(428, 358, 30, 20);
		contentPane.add(spinner_5);
		
		JButton btnJuice = new JButton("Juice");
		btnJuice.setBounds(370, 386, 89, 23);
		contentPane.add(btnJuice);
		
		JButton btnMilk = new JButton("Milk");
		btnMilk.setBounds(206, 386, 89, 23);
		contentPane.add(btnMilk);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(264, 358, 30, 20);
		contentPane.add(spinner_4);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("Number");
		lblNewLabel_2_2_4.setBounds(196, 361, 46, 14);
		contentPane.add(lblNewLabel_2_2_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Price");
		lblNewLabel_2_1_4.setBounds(196, 341, 46, 14);
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_4_4 = new JLabel("15");
		lblNewLabel_2_4_4.setBounds(264, 341, 46, 14);
		contentPane.add(lblNewLabel_2_4_4);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("Milk");
		lblNewLabel_2_3_4.setBounds(264, 322, 46, 14);
		contentPane.add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_8 = new JLabel("Name");
		lblNewLabel_2_8.setBounds(196, 322, 46, 14);
		contentPane.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_1_4 = new JLabel("New label");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\milk (1).jpg"));
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setBackground(SystemColor.menu);
		lblNewLabel_1_4.setBounds(186, 232, 154, 79);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\Computer\\Downloads\\coffee (1).jpg"));
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setBackground(SystemColor.menu);
		lblNewLabel_1_3.setBounds(20, 232, 154, 79);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_7 = new JLabel("Name");
		lblNewLabel_2_7.setBounds(30, 322, 46, 14);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Coffee");
		lblNewLabel_2_3_3.setBounds(98, 322, 46, 14);
		contentPane.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("20");
		lblNewLabel_2_4_3.setBounds(98, 341, 46, 14);
		contentPane.add(lblNewLabel_2_4_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Price");
		lblNewLabel_2_1_3.setBounds(30, 341, 46, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Number");
		lblNewLabel_2_2_3.setBounds(30, 361, 46, 14);
		contentPane.add(lblNewLabel_2_2_3);
		
		JButton btnCoffee = new JButton("Coffee");
		btnCoffee.setBounds(40, 386, 89, 23);
		contentPane.add(btnCoffee);
		
		JLabel lblNewLabel_3 = new JLabel("Lists");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_3.setBounds(597, 55, 94, 34);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4.setBounds(545, 117, 231, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(545, 153, 231, 20);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		lblNewLabel_4_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(545, 185, 231, 20);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("New label");
		lblNewLabel_4_3.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4_3.setBounds(545, 216, 231, 20);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("New label");
		lblNewLabel_4_4.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4_4.setBounds(545, 247, 231, 20);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("New label");
		lblNewLabel_4_5.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4_5.setBounds(545, 278, 231, 20);
		contentPane.add(lblNewLabel_4_5);
		
		JButton btnNewButton_1 = new JButton("Commander");
		btnNewButton_1.setBounds(532, 341, 89, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Annuler");
		btnNewButton_1_1.setBounds(652, 341, 89, 39);
		contentPane.add(btnNewButton_1_1);
		
}	
}

