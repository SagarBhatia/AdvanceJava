import java.io.IOException;
import java.net.*; 
public class UDPServer05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] b=new byte[100];
		DatagramSocket dss=new DatagramSocket(1234);
		DatagramPacket dpp=new DatagramPacket(b,100);
		dss.receive(dpp);
		String s =new String(b);
		System.out.println(s);
	}

}
