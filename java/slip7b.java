import java.awt.*;
import java.awt.event.*;

public class Slip12 extends Frame implements ActionListener,Runnable
{
	Thread y;
	TextField t;
	Button b;
	Slip12()
	{
		t=new TextField(20);
		b=new Button("start");
		setLayout(new FlowLayout());
		add(b);
		add(t);
		b.addActionListener(this);
		setSize(300,300);
		setVisible(true);	
		y=new Thread(this);
	}	
	public void actionPerformed(ActionEvent e)
	{
		String msg=e.getActionCommand();
		if(msg.equals("start"))
		{
			y.start();
		}
	}
	public void run()
	{
			for(int i=1;i<=100;i++)
			{
			t.setText(i+"");
				try
				{
				Thread.sleep(100);
				}
				catch(Exception e){}
		}
	}

	
	public static void main(String[] d)
	{
		new Slip12();
	}

}
