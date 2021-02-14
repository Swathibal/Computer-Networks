package cn_lab;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Rpc_sender {

	
	public static void main(String[] args) {
		try
		{
			Socket s1 = new Socket("localhost",6000);
			System.out.println("Connection established...");
			Scanner sc = new Scanner(System.in);
			DataInputStream di = new DataInputStream(s1.getInputStream());
			DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
			System.out.println("Enter the 1st operand:");
			int n1 = sc.nextInt();
			sc.nextLine();
			dos.write(n1);
			System.out.println("Enter the 2nd operand:");
			int n2 = sc.nextInt();
			sc.nextLine();
			dos.write(n2);
			int sum = di.read();
			System.out.println("Sum is "+sum);
			s1.close();
		}
		catch(Exception e)
		{
			System.out.println("Error occured "+e);
		}
	}

}
