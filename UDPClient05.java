import java.io.IOException;
import java.net.*;
public class UDPClient05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str=new String("Hello World !");
		DatagramSocket ds=new DatagramSocket();
		byte[] b=new byte[100];
		b=str.getBytes();
		InetAddress ia=InetAddress.getLocalHost();
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,1234);
		ds.send(dp);
	}

}
