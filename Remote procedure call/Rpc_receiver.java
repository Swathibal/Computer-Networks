package cn_lab;

import java.io.*;
import java.net.*;
import java.util.Date;

public class Rpc_receiver {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss = new ServerSocket(6000);
			while(true)
			{
				Socket s = ss.accept();
				DataOutputStream ds = new DataOutputStream(s.getOutputStream());
				ds.writeBytes("Server Date: "+(new Date().toString())+"\n");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error occured "+e);
		}

	}

}
