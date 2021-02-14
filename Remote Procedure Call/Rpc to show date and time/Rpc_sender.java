package cn_lab;

import java.net.*;
import java.io.*;

public class Rpc_sender {

	
	public static void main(String[] args) {
		try
		{
			Socket s1 = new Socket("localhost",6000);
			System.out.println("Connection established...\nSending the request to show date and time..");
			BufferedReader bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			System.out.println(bf.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Error occured "+e);
		}
	}

}
