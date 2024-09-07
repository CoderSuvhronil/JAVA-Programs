import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FrameDemo implements ActionListener
{
	JButton b1,b2;
	JTextField t1,t2,t3;
	JFrame f;
	int count;
	FrameDemo()
	{
		f=new JFrame("Demo Frame");
		f.setTitle("My Frame");
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setResizable(false);
		b1=new JButton("SUM");
		b2=new JButton("CLEAR");
		JLabel l1=new JLabel("Enter 1st Number ");
		JLabel l2=new JLabel("Enter 2nd Number ");

		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		f.setLayout(null);

		l1.setBounds(10,20,120,30);
		f.add(l1);
		t1.setBounds(160,20,80,30);
		f.add(t1);

		l2.setBounds(10,100,120,30);
		f.add(l2);
		t2.setBounds(160,100,80,30);
		f.add(t2);

		b1.setBounds(140,160,120,30);
		f.add(b1);
		
		t3.setBounds(140,220,120,30);
		f.add(t3);

		b2.setBounds(140,280,120,30);
		f.add(b2); b2.setEnabled(false);

		b1.addActionListener(this);
		b2.addActionListener(this);

		count=3;
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int x,y,z;
		if(e.getSource().equals(b1))
		{
			while(count>0)
			{
				try
				{
					x=Integer.parseInt(t1.getText());
					y=Integer.parseInt(t2.getText());
					z=x+y;
					t3.setText(String.valueOf(z));
					JOptionPane.showMessageDialog(f,"Sum is "+z);
					b2.setEnabled(true);
					b1.setEnabled(false);
				}
				catch(NumberFormatException e1)
				{
					count--;
					JOptionPane.showMessageDialog(f,"Enter integers only. You have "+count+" chances left!!!");
					t1.setText("");
					t2.setText("");
				}
			}
		}
		else if(e.getSource().equals(b2))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			b1.setEnabled(true);
			b2.setEnabled(false);
		}
	}
	public static void main(String s[])
	{
		new FrameDemo();	
	} 
}









