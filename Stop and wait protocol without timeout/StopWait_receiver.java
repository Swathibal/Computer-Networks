package cn_lab;

import java.util.*;
import java.io.*;
import java.net.*;

public class StopWait_receiver {
   public static void main(String args[])
   {
	   try
	   {
		   ServerSocket ss = new ServerSocket(8000);
		   Socket s= ss.accept();
		   DataInputStream dp = new DataInputStream(s.getInputStream());
		   Integer n = dp.read();
		   for(int i=0;i<n;i++)
		   {
			   ServerSocket s1 = new ServerSocket(9000+i);
			   Socket s2 = s1.accept();
			   DataInputStream d1 = new DataInputStream(s2.getInputStream());
			   String str = d1.readUTF();
			   System.out.println(str+"\nFrame "+ i + "received\n");
			   DataOutputStream dos =new DataOutputStream(s2.getOutputStream());
			   dos.write(i);
			   System.out.println("Acknowledgement sent for "+i);
			   
		   }
	   }
	   catch(Exception e)
	   {
		   System.out.println("Error occured"+e);
	   }
   }
}
