import java.io.IOException;
import java.net.*;
import java.util.*;


public class Client_Sagar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name,br_name,str;
		int stu_id;
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds=new DatagramSocket();
		byte b[]=new byte[100];
		InetAddress ia=InetAddress.getByName("localhost");
		System.out.println("Enter Student Name,Branch,Id: ");
		name=sc.nextLine();
		br_name=sc.nextLine();
		stu_id=sc.nextInt();
		//System.out.println(name + "   "+ br_name+"   "+stu_id);
		str=name+" "+br_name+" "+stu_id;
		//System.out.println(str);
		b=str.getBytes();
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,2121);
		ds.send(dp);
	}

}


 