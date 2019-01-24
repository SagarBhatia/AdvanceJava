package prac1_a;
import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ServerSocket ss=new ServerSocket(3333);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str="",str2="";
			//System.out.println("Message= "+str);
			while(!str.equals("stop"))
			{
				str=dis.readUTF();
				System.out.println("Client Says: "+str);
				str2=br.readLine();
				dout.writeUTF(str2);
			}
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}



