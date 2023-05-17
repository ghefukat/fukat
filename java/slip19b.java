import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class StudendAwtJdbc extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1;

public StudendAwtJdbc()
{
setLayout(null);
setSize(800,600);
setTitle("Record Display");
setVisible(true);

l1=new Label("ENTER ENO");
l1.setBounds(100,200,150,50);
add(l1);

//l2=new Label("Answer");
//l2.setBounds(100,100,150,50);
//add(l2);

t1=new TextField();
t1.setBounds(500,200,150,50);
add(t1);

t2=new TextField();
t2.setBounds(300,300,150,50);
add(t2);


b1=new Button("DISPLAY");
b1.setBounds(300,400,150,50);
add(b1);
b1.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
	String cap=ae.getActionCommand();
	if(cap.equals("DISPLAY"))
	{
		try
		{
	Connection con;
	PreparedStatement ps;
	String query;
	ResultSet rs;
	
	
	int a;
	String d;
	
	
	/*Scanner sc=new Scanner(System.in);
							  	
	System.out.println("Pls Enter ENAME");
	b=sc.next();
	*/
	a=Integer.parseInt(t1.getText());
	
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	query="select * from student where rno like ?"; //step 5 - make the query
		
	ps=con.prepareStatement(query);  //step 4 create the statement
	
	ps.setInt(1,a);
	
	
	rs=ps.executeQuery(); // step 6 fire the query
	if(rs.next())
	{
	t2.setText(rs.getInt("rno") + " " + rs.getString("sname") + " " + rs.getFloat("percentage"));
	}
	
	
	ps.close();		//step 7 close the statement and connections
	con.close();
	
	}catch(Exception e){}
		
	}
}
}


public class Slip19_q2
{
	public static void main(String args[])
	{
	new StudendAwtJdbc();
	}
}
