package com.java.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class Cuisinier extends JFrame {

	private JPanel contentPane;
	private Object[][] objects = null;
	private JTable table;
	private String [] colum = {"Name","numbre","prix"};
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public Cuisinier() throws ClassNotFoundException {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("cuisinier");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(165, 0, 80, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Id");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(35, 63, 62, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(119, 63, 62, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nombre");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(210, 63, 62, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Check");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(301, 63, 80, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tacos");
		lblNewLabel_1_1_1.setBounds(119, 104, 62, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("-----------------------------------------------------------------------------------");
		lblNewLabel_1_1_1_1.setBounds(21, 88, 332, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("1");
		lblNewLabel_1_1_1_2.setBounds(35, 154, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("1");
		lblNewLabel_1_1_1_3.setBounds(210, 104, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Pizza");
		lblNewLabel_1_1_1_5.setBounds(119, 129, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("1");
		lblNewLabel_1_1_1_6.setBounds(35, 129, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("2");
		lblNewLabel_1_1_1_7.setBounds(210, 129, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_7);
		
		JLabel lblNewLabel_1_1_1_9 = new JLabel("Coffe");
		lblNewLabel_1_1_1_9.setBounds(119, 154, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_9);
		
		JLabel lblNewLabel_1_1_1_10 = new JLabel("1");
		lblNewLabel_1_1_1_10.setBounds(35, 104, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_10);
		
		JLabel lblNewLabel_1_1_1_11 = new JLabel("1");
		lblNewLabel_1_1_1_11.setBounds(210, 154, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_11);
		
		JLabel lblNewLabel_1_1_1_12 = new JLabel("Milk");
		lblNewLabel_1_1_1_12.setBounds(119, 179, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_12);
		
		JLabel lblNewLabel_1_1_1_13 = new JLabel("1");
		lblNewLabel_1_1_1_13.setBounds(35, 179, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_13);
		
		JLabel lblNewLabel_1_1_1_14 = new JLabel("1");
		lblNewLabel_1_1_1_14.setBounds(210, 179, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_14);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(296, 104, 57, 14);
		contentPane.add(btnNewButton);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(0, 255, 0));
		btnOk.setBounds(296, 125, 57, 14);
		contentPane.add(btnOk);
		
		JButton btnOk_1 = new JButton("OK");
		btnOk_1.setBackground(new Color(0, 255, 0));
		btnOk_1.setBounds(296, 150, 57, 14);
		contentPane.add(btnOk_1);
		
		JButton btnOk_2 = new JButton("OK");
		btnOk_2.setBackground(new Color(0, 255, 0));
		btnOk_2.setBounds(296, 179, 57, 14);
		contentPane.add(btnOk_2);
		
		
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuisinier frame = new Cuisinier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
