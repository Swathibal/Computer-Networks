import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class find
{
	void findaddr(File fp,String addr,Scanner myread)
	{
		String line;
		int flag = 0;
		  while(myread.hasNextLine())
		 {
			 line = myread.nextLine();
			 if(line.contains(addr)) 
			 {
				 flag = 1;
				 System.out.println("IP address\t\tPhysical address\tType");
				 System.out.printf("%-7s",line);
				 break;
			 }
				 
		 }
		 if(flag == 0)
		 {
			System.out.println("Not found"); 
		 }
	}
}

public class Arp_Rarp {
	public static void main(String args[]) throws FileNotFoundException
	{
		String IP,MAC;
		find obj = new find();
	    Scanner sc = new Scanner(System.in);
		File fp = new File("E:\\javaprogram\\cache.txt");
		Scanner myread = new Scanner(fp);
		System.out.println("Select the protocol:\n1.ARP\n2.RARP\n===========================================");
		int protocol = sc.nextInt();
		sc.nextLine();
		switch(protocol)
		{
		case 1 :
		{
			System.out.println("ARP protocol:\nEnter the IP address:");
			IP = sc.nextLine();
			obj.findaddr(fp,IP,myread);
	        break;
		}
		case 2 :
		{
			System.out.println("RARP protocol:\nEnter the MAC address:");
			MAC = sc.nextLine();
			obj.findaddr(fp,MAC,myread);
	        break;
		}
			
		}
   }

}

