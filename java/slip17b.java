
//Client code:
import java.io.*;

import java.net.*;

import java.util.*;

public class ClientFile

{

                static Scanner sc=new Scanner(System.in);

                public static void main(String args[]) throws IOException

                {

                try

                {

                Socket client=new Socket("localhost",7777);

               

                DataInputStream dis=new DataInputStream(client.getInputStream());

                DataOutputStream dos=new DataOutputStream(client.getOutputStream());

               

                System.out.println("pls enter a file name");

                String cfilename=sc.next();

               

                dos.writeUTF(cfilename);

                                String msg=dis.readUTF();

                               

                                if(msg.equalsIgnoreCase("0"))

                                System.out.println("File does not exists");

                                else

                                System.out.println(msg);

                }

                catch(Exception e){}

               

                }

}

// Server code:
import java.io.*;

import java.net.*;

class ServerFile

{

    public static void main(String args[]) throws IOException

    {

        try

        {

            ServerSocket server = new ServerSocket(7777);

            Socket s = server.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String sfilename = dis.readUTF();

            File file = new File(sfilename);

            if (file.exists())

            {

                FileInputStream fin = new FileInputStream(sfilename);

                int ch;

                String fileinfo = "";

                while ((ch = fin.read()) != -1)

                {

                    fileinfo = fileinfo + (char) ch;

                }

                System.out.println(fileinfo);

                dos.writeUTF(fileinfo);

            }

            else

                dos.writeUTF("0");

        }

        catch (Exception e) {
        }

    }

}