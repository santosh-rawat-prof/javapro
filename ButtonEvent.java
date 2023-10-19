import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.lang.*;

public class ButtonEvent 
 {

	private HandleButton button ;
	private int numClicks = 0 ;
	private Label messageLabel ;

	public ButtonEvent() 
     {
		Frame frame = new Frame("AWT Button Event");
		
		button = new HandleButton("Click Me") ;
		messageLabel = new Label();

		frame.add(button);
		frame.add(messageLabel);
	

		button.setBounds(30, 30, 90, 30);
		messageLabel.setBounds(90, 90, 90, 30);
		messageLabel.setText("Event : " + numClicks++);
		frame.setSize(400, 350);
		frame.setVisible(true);
  }
	
	public static void main(String [] args) {
 		new ButtonEvent();
   }


class HandleButton extends Button {

	HandleButton(String label) 
      {
	  super(label);
	  enableEvents(AWTEvent.ACTION_EVENT_MASK);
  }

 	
	@Override
	protected void processActionEvent(ActionEvent event) 
     {
  	  messageLabel.setText ("Event: "  + numClicks++);
	  super.processActionEvent (event);
   }
  }
}