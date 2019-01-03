import javax.swing.*;

import java.lang.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class TestSwing extends JFrame implements ActionListener{
	String s1,s2,s3;
	JButton jb;
	JPanel jp;
	JLabel jl;
	JLabel jl2;
	JLabel jl3;
	JTextField jtf;
	JPasswordField jpf;
	JComboBox jcb;
	TestSwing()
	{
		setSize(400,400);
		setTitle("FORM");
		
		jpf=new JPasswordField(20);
		jp=new JPanel();
		jl=new JLabel("Username: ");
		jl2=new JLabel("Password: ");
		jb= new JButton("LOGIN");
		jtf=new JTextField(20);
		jl3=new JLabel();
		jcb=new JComboBox();
		jcb.addItem("Surat");
		jcb.addItem("Ahmedabad");
		jcb.addItem("Rajkot");
		jp.add(jl);
		jp.add(jtf);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb);
		jp.add(jl3);
		jp.add(jcb);
		//s3=(String) jcb.getSelectedItem();
		//jtf.setText(s3);
		Container c=this.getContentPane();
		jb.addActionListener(this);
		jcb.addActionListener(this);
		c.add(jp);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==jcb)
		{
			s3=(String) jcb.getSelectedItem();
			//System.out.println(s1 +"   "+s2);
			jtf.setText(s3);
		}
		else
		{
			s1=jtf.getText();
			s2=jpf.getText();
			if(s1.equals("admin") && s2.equals("admin") )
			{
				jl3.setText("Login Successfull !!");
				//System.out.println("Login Successful !!");
			}
			else
			{
				jl3.setText("Invalid Login !!");
			}
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		TestSwing t1= new TestSwing();
		t1.setVisible(true);
	}

}
