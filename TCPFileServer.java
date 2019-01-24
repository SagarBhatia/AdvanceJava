import java.io.*;
import java.net.*;
public class TCPFileServer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(1212);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		FileOutputStream fout=new FileOutputStream("Receiver.txt");
		int  r;
		while((r=din.read())!=-1)
		{
			fout.write((char)r);
		}
	}

}
