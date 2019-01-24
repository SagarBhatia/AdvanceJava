package prac1_a;

import java.io.*;
import java.net.*;


public class TestClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Client c=new Client();
		c.doEcho();
	}
	

}
class Client
{
	Socket s;
	String str="",str2="";
	DataInputStream din;  
	DataOutputStream dout;
	BufferedReader br;
	Client() throws UnknownHostException, IOException
	{
		 s=new Socket("localhost",3333);
		 br=new BufferedReader(new InputStreamReader(System.in));
		 din=new DataInputStream(s.getInputStream());  
		dout=new DataOutputStream(s.getOutputStream());
	}
	void doEcho() throws IOException
	{ 
		while(!str.equals("stop"))
		{
			str=br.readLine();
			dout.writeUTF(str);
			str2=din.readUTF();
			System.out.println("Server Says: "+str2);
		}
	}
}
