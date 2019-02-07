import java.io.*;
import java.net.*;
import java.util.*;
public class Client_3A {

	private static Scanner sc;

	public static void main(String[] args) throws Exception  {
		int n;
		sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n=sc.nextInt();
		byte[] b=new byte[n];
		byte[] b2=new byte[n];
		System.out.println("Enter Elements: ");
		for (int i=0;i<n;i++)
		{
			b[i]=(byte) sc.nextInt();
		}
		/*for (int i=0;i<n;i++)
		{
			//b[i]=(byte) sc.nextInt();
			System.out.println(b[i]);
		}*/
		DatagramSocket ds=new DatagramSocket();
		InetAddress ia= InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(b,b.length,ia , 2121);
		byte size[] = new byte[1];
		size[0] = (byte)n;
		DatagramPacket si=new DatagramPacket(size,size.length,ia , 2121);
		ds.send(si);
		ds.send(dp);
		DatagramPacket dp2=new DatagramPacket(b2,b2.length);
		ds.receive(dp2);
		for(byte i:b2){
			System.out.println((int)i);
		}
		
	}

}
