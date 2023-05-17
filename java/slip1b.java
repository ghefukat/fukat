Server code:
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;

class MyServer extends Frame implements ActionListener
{
	static TextField t1=new TextField(20);
	static Button b1=new Button("Send");
	static TextArea ta=new TextArea(5,20);
	static DataOutputStream dos;
	static DataInputStream dis;
	static ServerSocket st;
	static Socket s;
	static String r;
	MyServer()
	{
		setLayout(new FlowLayout());
		add(t1);add(b1);add(ta);
		b1.addActionListener(this);		
		setVisible(true);
		setSize(300,300);
	}
	public void actionPerformed(ActionEvent e)
	{
		String cmd=e.getActionCommand();
		if(cmd.equalsIgnoreCase("send"))
		{
			try
			{
			r=t1.getText();
			dos.writeUTF(r);
			}
			catch(Exception p)
			{
			}
		}
	}
	public static void main(String[] d ) throws IOException
	{
		new MyServer();
		
		st=new ServerSocket(1281);	
		s=st.accept();
		dos=new DataOutputStream(s.getOutputStream());
		dis=new DataInputStream(s.getInputStream());
		while(true)
		{
			r=dis.readUTF();
			ta.append("client:"+r+"\n");
		}
	}
	
}
Client code:
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;

class MyClient extends Frame implements ActionListener
{
	static TextField t1=new TextField(20);
	static Button b1=new Button("Send");
	static TextArea ta=new TextArea(5,20);
	static DataOutputStream dos;
	static DataInputStream dis;
	static Socket s;
	static String r;
	MyClient()
	{
		setLayout(new FlowLayout());
		add(t1);add(b1);add(ta);
		b1.addActionListener(this);		
		setVisible(true);
		setSize(300,300);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
		 try
		{
			r=t1.getText();
			dos.writeUTF(r);
		}
		catch(Exception p)
		{
		}
		}
	}
	public static void main(String[] d ) throws IOException
	{
		MyClient x= new MyClient();
		
		
		s=new Socket("localhost",1281);
		dos=new DataOutputStream(s.getOutputStream());
		dis=new DataInputStream(s.getInputStream());
		while(true)
		{
			r=dis.readUTF();
			ta.append("Server:"+r+"\n");
		}
	}
	
}