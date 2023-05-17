import java.net.*;
import java.io.*;
import java.util.*;

class s14q1Client
{
	public static void main(String[] a)throws IOException
	{
		Socket st=new Socket("localhost",5917);
		DataInputStream dis=new DataInputStream(st.getInputStream());
		String d=dis.readUTF()+"";
		System.out.println("date:"+d);
	}

}

Server code:
import java.net.*;
import java.io.*;
import java.util.*;

class s14q1Server
{
	public static void main(String[] a)throws IOException
	{
		ServerSocket st=new ServerSocket(5917);
		Socket s= st.accept();
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		Date d=new Date();
		System.out.println("date:"+d);
		dos.writeUTF(d+"");
	}

}