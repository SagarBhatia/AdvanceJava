import java.net.*;
import java.util.*;
import java.io.*;

public class Server_3A  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] size=new byte[1];
		DatagramSocket dss=new DatagramSocket(2121);
		DatagramPacket si=new DatagramPacket(size,size.length);
		dss.receive(si);
		byte[] b=new byte[(int)size[0]];
		DatagramPacket dpp=new DatagramPacket(b,b.length);
		//DatagramPacket dpp2=new DatagramPacket(b,b.length);
		dss.receive(dpp);
		Arrays.sort(b);
		/*for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0){
			System.out.println(b[i]);}
		}*/
		DatagramPacket dpp2=new DatagramPacket(b,b.length,dpp.getAddress(),dpp.getPort());
		dss.send(dpp2);
		
		
		
	}

}
