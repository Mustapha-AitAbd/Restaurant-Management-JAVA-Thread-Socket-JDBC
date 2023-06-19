package com.java.project;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
	public Test() {};

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 
		try {
			Socket socketClient = new Socket("localhost", 1116);
			ObjectInputStream s = new ObjectInputStream(socketClient.getInputStream());
			Number r = (Number)s.readObject();
			System.out.print("Nbre de pizza" +r.getNbr1());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String processObject(Client c) {
		// TODO Auto-generated method stub
		System.out.println(c.getNbr1());
		return c.getNbr1();
	}

}
