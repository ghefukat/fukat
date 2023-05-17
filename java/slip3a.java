Server code:
package IshaPro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
class IshaPrimeServer    
{
public static void main(String args[])      
{

  try{
      ServerSocket ss = new ServerSocket(8420);   
      //Print server is started
      System.out.println("Server Started...............");
      //Accept method
      Socket s = ss.accept();
      //For accepting characters take information
      DataInputStream in = new DataInputStream(s.getInputStream()); 
      //Store the number in x variable
      int x = in.readInt(); 
      //To print information Characters UTC Encoded
      DataOutputStream otc = new DataOutputStream(s.getOutputStream());
      int flag=0;    //store in y variable
      
      for(int i = 2; i < x; i++)
      { 
        if(x % i == 0)  
        { 
          flag=1;
          //otc.writeUTF(x + " is Prime");
        }
      } 
      if(flag==0) {
        otc.writeUTF(x + " is Prime");
      }
      else
      {
        otc.writeUTF(x + " is not Prime");
      }
    } catch(Exception e)  //Catch your exception
    {
      System.out.println(e.toString());
    }
  }
}
Client code:
package IshaPro;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class IshaPrimeClient 
{
    public static void main(String args[])   
    {
        try
        {
            Socket cs = new Socket("LocalHost", 8420); 
            
            BufferedReader infu = new BufferedReader(new InputStreamReader(System.in)); 

            System.out.println("Enter a number : ");

            int a = Integer.parseInt(infu.readLine());  

            DataOutputStream out = new DataOutputStream(cs.getOutputStream());   

            out.writeInt(a);

            DataInputStream in = new DataInputStream(cs.getInputStream()); 
            
            System.out.println(in.readUTF());
            
            cs.close();          }
        catch(Exception e)
        {
            System.out.println(e.toString()); 
        }
    }
}
