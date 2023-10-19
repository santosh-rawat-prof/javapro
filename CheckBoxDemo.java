import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxDemo implements ItemListener
{
    private Checkbox cbJava, cbPython, cbCPlusPlus;
    private Label messageLabel;
    private String text = "";

    static Frame frame = new Frame("AWT CheckBox");

    public CheckBoxDemo()
    {
	Font font = new Font("SansSerif", Font.BOLD, 12);

	cbJava = new Checkbox("Java");
	cbPython = new Checkbox("Python");
	cbCPlusPlus = new Checkbox("C++");
	messageLabel = new Label();

	cbJava.setBounds(10, 40, 160, 30);
	cbPython.setBounds(10, 80, 160, 30);
	cbCPlusPlus.setBounds(10, 120, 160, 30);
	messageLabel.setBounds(10, 160, 160, 100);

	cbJava.setFont(font);
	cbPython.setFont(font);
	cbCPlusPlus.setFont(font);

	frame.add(cbJava);
	frame.add(cbPython);
	frame.add(cbCPlusPlus);
	frame.add(messageLabel);

	cbJava.addItemListener(this);
	cbPython.addItemListener(this);
	cbCPlusPlus.addItemListener(this);

	frame.setSize(400, 350);
	frame.setVisible(true);
    }

    public static void main(String[] args)
    {
	new CheckBoxDemo();

	frame.addWindowListener(new WindowAdapter()
        {
	    public void windowClosing(WindowEvent we)
	    {
		frame.dispose(); // use dispose method
	    }
	});
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
	text = "";
	text += "Languages:";
	text += " Java: " + cbJava.getState();
	text += " Python: " + cbPython.getState();
	text += " C++: " + cbCPlusPlus.getState();
	messageLabel.setText(text);
    }
}
    
