package com.java.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Caissier extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
				try {
					Caissier frame = new Caissier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}	
		
	}

	/**
	 * Create the frame.
	 */
	public Caissier() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caissier");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(122, 0, 88, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29, 47, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(122, 47, 61, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Prix");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(229, 47, 61, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("--------------------------------------------------------------------");
		lblNewLabel_1_3.setBounds(29, 61, 272, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Facture");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(122, 304, 89, 23);
		contentPane.add(btnNewButton);
		
		
			
			
			JLabel lblNewLabel_1_4 = new JLabel("Tacos");
			lblNewLabel_1_4.setBounds(29, 86, 61, 14);
			contentPane.add(lblNewLabel_1_4);
			
			JLabel lblNewLabel_1_5 = new JLabel("1");
			lblNewLabel_1_5.setBounds(122, 86, 61, 14);
			contentPane.add(lblNewLabel_1_5);
			
			JLabel lblNewLabel_1_6 = new JLabel("40");
			lblNewLabel_1_6.setBounds(217, 86, 61, 14);
			contentPane.add(lblNewLabel_1_6);
			
			JLabel lblNewLabel_1_7 = new JLabel("Pizza");
			lblNewLabel_1_7.setBounds(29, 111, 61, 14);
			contentPane.add(lblNewLabel_1_7);
			
			JLabel lblNewLabel_1_8 = new JLabel("2");
			lblNewLabel_1_8.setBounds(122, 111, 61, 14);
			contentPane.add(lblNewLabel_1_8);
			
			JLabel lblNewLabel_1_9 = new JLabel("80");
			lblNewLabel_1_9.setBounds(217, 111, 61, 14);
			contentPane.add(lblNewLabel_1_9);
			
			JLabel lblNewLabel_1_10 = new JLabel("Coffe");
			lblNewLabel_1_10.setBounds(29, 136, 61, 14);
			contentPane.add(lblNewLabel_1_10);
			
			JLabel lblNewLabel_1_11 = new JLabel("1");
			lblNewLabel_1_11.setBounds(122, 136, 61, 14);
			contentPane.add(lblNewLabel_1_11);
			
			JLabel lblNewLabel_1_12 = new JLabel("40");
			lblNewLabel_1_12.setBounds(217, 136, 61, 14);
			contentPane.add(lblNewLabel_1_12);
			
			JLabel lblNewLabel_1_13 = new JLabel("Milk");
			lblNewLabel_1_13.setBounds(29, 161, 61, 14);
			contentPane.add(lblNewLabel_1_13);
			
			JLabel lblNewLabel_1_14 = new JLabel("1");
			lblNewLabel_1_14.setBounds(122, 161, 61, 14);
			contentPane.add(lblNewLabel_1_14);
			
			JLabel lblNewLabel_1_15 = new JLabel("40");
			lblNewLabel_1_15.setBounds(217, 161, 61, 14);
			contentPane.add(lblNewLabel_1_15);
			
			JLabel lblNewLabel_1_16 = new JLabel("Total");
			lblNewLabel_1_16.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_16.setBounds(29, 272, 61, 14);
			contentPane.add(lblNewLabel_1_16);
			
			JLabel lblNewLabel_1_3_1 = new JLabel("--------------------------------------------------------------------");
			lblNewLabel_1_3_1.setBounds(18, 236, 272, 14);
			contentPane.add(lblNewLabel_1_3_1);
			
			JLabel lblNewLabel_1_16_1 = new JLabel("200 DH");
			lblNewLabel_1_16_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_16_1.setBounds(100, 272, 61, 14);
			contentPane.add(lblNewLabel_1_16_1);
			try {
				Socket socketClient = new Socket("localhost", 1119);
				
				ObjectInputStream os = new ObjectInputStream(socketClient.getInputStream());
				Client r = (Client)os.readObject();
				lblNewLabel_1_16.setText(r.getTacos() + "");
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			
		}}
		
	}

