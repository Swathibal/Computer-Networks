package cn_lab;

import java.io.*;
import java.net.*;
import java.util.Date;

public class Rpc_receiver {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss = new ServerSocket(6000);
			
				Socket s = ss.accept();
				DataOutputStream ds = new DataOutputStream(s.getOutputStream());
				DataInputStream di = new DataInputStream(s.getInputStream());
				int a = di.read();
				int b=di.read();
				int c=a+b;
				ds.write(c);
				System.out.println(a + b);
			
		}
		catch(Exception e)
		{
			System.out.println("Error occured "+e);
		}

	}

}
