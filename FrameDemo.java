import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FrameDemoModified 
{
	JButton b1,b2;
	JTextField t1,t2,t3;
	JFrame f;
	int count;
	Font ft;
	FrameDemoModified()
	{
		f=new JFrame("Demo Frame");
		f.setTitle("My Frame");
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setResizable(false);
		b1=new JButton("SUM");
		b2=new JButton("CLEAR");
		ft=new Font("Algerian",Font.BOLD,20);
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

		t1.setFont(ft);t2.setFont(ft);t3.setFont(ft);
		t1.setToolTipText("Enter a number");

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int x=Integer.parseInt(t1.getText());
					int y=Integer.parseInt(t2.getText());
					int z=x+y;
					t3.setText(String.valueOf(z));
					JOptionPane.showMessageDialog(f,"Sum is "+z);
					b2.setEnabled(true);
					b1.setEnabled(false);
				}
				catch(NumberFormatException e1)
				{
					count--;
					JOptionPane.showMessageDialog(f,"Enter integers only. ");
					t1.setText("");
					t2.setText("");
				}
			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				b1.setEnabled(true);
				b2.setEnabled(false);
			}			
		});

		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
	public static void main(String s[])
	{
		new FrameDemoModified();	
	} 
}
