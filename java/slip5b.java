import java.applet.*;
import java.awt.*;


public class Slip333 extends Applet implements Runnable
{
	static int x;
	
	public void init()
	{
	Thread tx=new Thread(this);
	tx.start();
	}
	
	public void run()
	{
	repaint();
	}
	public void paint(Graphics g)
	{
	g.drawRect(100,100,200,400);
	g.drawOval(120,120,100,100);//red
	g.drawOval(120,240,100,100);//yellow
	g.drawOval(120,360,100,100);//green
		if(x==0)
		{
			g.setColor(Color.red);
			g.fillOval(120,120,100,100);
			x=1;
		}
		
		else if(x==1)
		{
			g.setColor(Color.yellow);
			g.fillOval(120,240,100,100);
			x=2;
		}
		
		else if(x==2)
		{
			g.setColor(Color.green);
			g.fillOval(120,360,100,100);
			x=0;
		}
		
		try{
		if(x==1){Thread.sleep(5000);}
		else if(x==2){Thread.sleep(1000);}
		else if(x==0){Thread.sleep(5000);}
		}
		catch(Exception e){}
		repaint();
	}
}