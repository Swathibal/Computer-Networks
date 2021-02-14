package cn_lab;

import java.util.*;
import java.io.*;
import java.net.*;

public class StopWait_sender {

	public static void main(String[] args) {
		try
		{
			System.out.println("Enter the no of frames:");
			Scanner sc =new Scanner(System.in);
			int n = sc.nextInt();
			sc.nextLine();
			if(n==0)
			{
				System.out.println("No frames to sent");
			}
			else
			{

				Socket sk = new Socket("localhost",8000);
				DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
				dos.write(n);
			}
			for(int i=0;i<n;i++)
			{
				Socket sn = new Socket("localhost",9000+i);
				System.out.println("Enter the message");
				String in = sc.nextLine();
				DataOutputStream ds = new DataOutputStream(sn.getOutputStream());
				ds.writeUTF(in);
				DataInputStream di = new DataInputStream(sn.getInputStream());
				Integer ss = di.read();
				System.out.println("Acknowlegement is received for "+ss);
			}
		 }
			catch(Exception e)
			{
				System.out.print("Error occured "+e);
			}
		}
		

	}


