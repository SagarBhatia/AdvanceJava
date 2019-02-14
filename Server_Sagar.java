import java.sql.*;
import java.util.*;
import java.io.IOException;
import java.net.*;

public class Server_Sagar {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DatagramSocket dss=new DatagramSocket(2121);
		byte[] b=new byte[100];
		DatagramPacket dpp=new DatagramPacket(b,100);
		dss.receive(dpp);
		String s=new String(b);
		System.out.println(s);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","");
		String temp[]=s.split(" ");
		int t=parseInt(temp[2]);
		System.out.println(temp[0] + temp[1] + temp[2]);
		String st="insert into student values('"+t+"','"+temp[0]+"','"+temp[1]+"')";
		Statement stmt=con.createStatement();
		PreparedStatement p1=con.prepareStatement(st);
		stmt.execute(st);
	
		}

	private static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
		
	}

	


