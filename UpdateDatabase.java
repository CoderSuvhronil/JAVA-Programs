import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UpdateDatabase
{
	JTextField tid, tname, tage;
	JButton bSearch, bUpdate, bSave;
	JFrame f;
	JLabel label;
	Connection con;
	UpdateDatabase()
	{
		tid=new JTextField(10);
		bSearch =new JButton("Search");
		f=new JFrame();
		f.setTitle("Update Record");
		f.setSize(400, 600);
		label=new JLabel("Enter the ID");

		f.setLocationRelativeTo(null);// set JFrame in center of the screen
		f.setResizable(false);//Fix the Size of the JFrame  
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setBounds(50,30,150,20);
		f.add(label);
		
		tid.setBounds(220,30,100,20);
		f.add(tid);

		bSearch.setBounds(150,80,100,20);
		f.add(bSearch);

		tname=new JTextField(10);
		tname.setBounds(60,120,100,20);
		f.add(tname);
		tname.setVisible(false);

		tage=new JTextField(10);
		tage.setBounds(200,120,100,20);
		f.add(tage);
		tage.setVisible(false);

		bUpdate=new JButton("Update");
		bUpdate.setBounds(150,150,100,20);
		f.add(bUpdate);
		bUpdate.setVisible(false);

		bSave=new JButton("SAVE");
		bSave.setBounds(150,190,100,20);
		f.add(bSave);
		bSave.setVisible(false);

		try
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		}
		catch(Exception e)
		{
		}

		bSearch.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tname.setVisible(true);
				tage.setVisible(true);
				bUpdate.setVisible(true);
				tname.setEnabled(false);
				tage.setEnabled(false);
				String sid=tid.getText();
				try
				{
					String query="select name,age from student where id=?";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,sid);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						String sname=rs.getString(1);
						int sage=rs.getInt(2);
						tname.setText(sname);
						tage.setText(String.valueOf(sage));
					}
					
				}
				catch(Exception e1)
				{
				}
			}
		});
		
		bUpdate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tname.setEnabled(true);
				tage.setEnabled(true);
				bSave.setVisible(true);
				bUpdate.setVisible(false);
			}
		});

		bSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String sid=tid.getText();
				String newName=tname.getText();
				int newAge=Integer.parseInt(tage.getText());
				try
				{
					String query="update student set name=?, age=? where id=?";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,newName);
					ps.setInt(2,newAge);
					ps.setString(3,sid);
					int rowUpdated=ps.executeUpdate();
					if(rowUpdated>0)
					{
						JOptionPane.showMessageDialog(f,"Updated Successfully");
					}
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		});

		f.setVisible(true);
	}
	public static void main(String arr[])
	{
		new UpdateDatabase();
	}
}