import javax.swing.*;
import java.awt.*;
class FrameDemo
{
	JButton b1,b2;
	JTextField t1,t2,t3;
	FrameDemo()
	{
		JFrame f=new JFrame("Demo Frame");
		f.setTitle("My Frame");
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setResizable(false);
		b1=new JButton("CLICK");
		b2=new JButton("CLEAR");
		JLabel l1=new JLabel("Enter 1st Number ");
		JLabel l2=new JLabel("Enter 2nd Number ");
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
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
		f.add(b2);

		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public static void main(String s[])
	{
		new FrameDemo();	
	} 
}