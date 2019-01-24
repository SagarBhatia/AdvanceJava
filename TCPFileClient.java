import java.io.*;
import java.net.*;
public class TCPFileClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",1212);
		FileInputStream fin=new FileInputStream("/root/Workspace/Connectionless/src/UDPServer05.java");
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		int r;
		while((r=fin.read())!=-1)
		{
			dout.write(r);
		}
		System.out.print("File Transfer Completed !");
		s.close();
		
	}

}
