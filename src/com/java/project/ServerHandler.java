package com.java.project;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerHandler implements Runnable{
	private Socket service_1;
	private Socket service_2;
	private ServerSocket ecoute_1 ;
	private ServerSocket ecoute_2 ;
	private ServerSocket ecoute_3 ;
	private ArrayList<Client> liste = new ArrayList<Client>();
	public ServerHandler (ServerSocket ecoute_1, ServerSocket ecoute_2) {
		
		this.ecoute_1 = ecoute_1;
		this.ecoute_2 = ecoute_2;
		//this.ecoute_2 = ecoute_3;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			while(true) {
				Socket service_1 = ecoute_1.accept();
				 Socket service_2 = ecoute_2.accept();
				ObjectInputStream os = new ObjectInputStream(service_1.getInputStream());
				Client c = (Client)os.readObject();
				liste.add(c);
				System.out.println(c.getNbr1());
				//Number A = new Number("p","p","p","p","p","p");
				Number A = new Number(c.getNbr1(),c.getNbr2(),c.getNbr3(),c.getNbr4(),c.getNbr5(),c.getNbr6());
				ObjectOutputStream p = new ObjectOutputStream(service_2.getOutputStream());
				p.writeObject(A);
				System.out.println(A.getNbr1());
				
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}

		
	

	}
}
