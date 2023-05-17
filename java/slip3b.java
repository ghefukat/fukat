import java.awt.*;
import java.applet.*;

public class BounceBall extends Applet implements Runnable
{
	int x,y;
	int dy;
	 
	
	public void init()
	{
		x=140;
		y=40;
		dy=30;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			
			if(y<40||y>260)
			{
				dy=-dy;
			}
			
			y=y+dy;
			
			try
			{
				Thread.sleep(800);
			}		
			catch(Exception e){}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		
		g.fillRect(10,10,330,300);
		if(y>260)
		g.setColor(new Color((int)(Math.random() * 1000)));
		else
		g.setColor(Color.red);
	
		g.fillOval(x,y,30,30);
	}
}