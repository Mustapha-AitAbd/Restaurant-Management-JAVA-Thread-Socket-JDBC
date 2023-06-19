package com.java.project;

import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;
public class Server {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ecoute_1 = new ServerSocket(1119);
			ServerSocket ecoute_2 = new ServerSocket(1116);
			//ServerSocket ecoute_3 = new ServerSocket(1117);
			while(true) {
			 //Socket service_1 = ecoute_1.accept();
			 //Socket service_2 = ecoute_2.accept();
			 ServerHandler clientThread = new ServerHandler(ecoute_1,ecoute_2);
			 Thread T = new Thread(clientThread);
			 T .start();
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
