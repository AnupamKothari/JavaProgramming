package Unit_04;

import java.awt.FlowLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SampleClass {

	public static void main(String[] args) {
		SampleWorkSwing obj= new SampleWorkSwing();

	}

}

class SampleWorkSwing extends JFrame{
	
	
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JRadioButton r1;
	JRadioButton r2;
	JCheckBox c1;
	JCheckBox c2;
		
	JLabel l1;
	JTextArea jr1;
	SampleWorkSwing()
	{
	//	jr1=new JTextArea(10,30);
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		t1=new 	JTextField(20);
		t2=new 	JTextField(20);
		b1=new JButton("Sum");
		b2=new JButton("Sub");
		b3=new JButton("Div");
		b4=new JButton("Multiply");
		l1=new JLabel("Result");
		
	//	add(jr1);
		add(t1);
		add(r1);
		add(r2);
		// Group radio buttons
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		add(c1);
		add(c2);
		
	
		ActionListener al =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int a1=Integer.parseInt(t1.getText());
			int a2=Integer.parseInt(t2.getText());
			String str=jr1.getText();
			if(e.getSource()==b1) {
				Integer sum=a1+a2;
				l1.setText(sum.toString());
			}
			
			if(e.getSource()==b2) {
				Integer sub=a1-a2;
				l1.setText(sub.toString());
			}
			if(e.getSource()==b4)
			{
				Integer multiply=a1*a2;
				l1.setText(multiply.toString());
			}
			if(r1.isSelected())
			{
				l1.setText("Male");
			}
			if(r2.isSelected())
			{
				l1.setText("Female");
				
			}
			if(c1.isSelected())
			{
				l1.setText("Is a Dance");
			}
			if(c1.isSelected())
			{
				l1.setText("Is a Singer");
			}
			}
			};
			
			// You can also make multiple ActionListener Class object to perform tasks
			ActionListener al1 =new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				
					int a1=Integer.parseInt(t1.getText());
					int a2=Integer.parseInt(t2.getText());
					String str=jr1.getText();
					if(e.getSource()==b3)
					{
						Integer div=a1/a2;
						l1.setText(div.toString());
					}
				}
				};
				

		
			
			
		
		
		
		// Logic on b1
		b1.addActionListener(al);
		b2.addActionListener(al);
	    b3.addActionListener(al1);
	    b4.addActionListener(al);
		
		
		
		// Every GUI Application requires these four lines
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}

