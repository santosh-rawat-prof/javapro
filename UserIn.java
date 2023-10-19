import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class UserIn extends Applet implements ActionListener
{
    TextField text1, text2;
    Button b1,b2;
    String whichButtonClk;
    public void init()
    {
	text1 = new TextField(8);
	text2 = new TextField(8);
	Button b1 = new Button("ADD");
	Button b2 = new Button("SUB");
	Button b3 = new Button("MUL");
        Button b4 = new Button("DIV");
	add(text1);
	add(text2);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	text1.setText("0");
	text2.setText("0");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
    }

    public void paint(Graphics g)
    {
	g.drawString(" Input a number in each box " ,10 ,50 );

	if(text1.getText().equals("") && text1.getText().equals(""))
	    {
	    }
	else
	    {
		Integer i1=  new Integer(text1.getText());
		Integer i2= new Integer(text2.getText());
		int sum = i1+i2;
		int subtract=i1-i2;
		int multiply=i1*i2;
		float divide=(float)i1/(float)i2;
		if(whichButtonClk.equals("ADD"))
		    g.drawString("Your sum is "+ sum, 10,190);
		if(whichButtonClk.equals("SUB"))
		    g.drawString("Your subtract is "+ subtract, 10,190);
		if(whichButtonClk.equals("MUL"))
		    g.drawString("Your multiply is "+ multiply, 10,190);
		if(whichButtonClk.equals("DIV"))
		    g.drawString("Your divide is "+ divide, 10,190);
	    }
    }

    public void actionPerformed(ActionEvent ae)
    {
	if(ae.getActionCommand().equals("ADD")||ae.getActionCommand().equals("SUB")||ae.getActionCommand().equals("MUL")||ae.getActionCommand().equals("DIV"))
	    {
		whichButtonClk=ae.getActionCommand();
	    }
	repaint();
    }
}
