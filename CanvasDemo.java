import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class CanvasDemo  {

      private CanvasDemo () {
              Frame frame = new Frame ("AWT Canvas");
              frame.add(new AwtCanvas()); 
        	   frame.setSize(500, 400);
		   frame.setVisible(true);
  }

      public static void main(String args[]) {
           new CanvasDemo();
}

      class AwtCanvas extends Canvas {

      AwtCanvas (){
	    setBackground (Color.orange);
    	    setSize(400, 300);
}
   public void paint (Graphics g) {

   g.setColor(Color.MAGENTA);
   g.fillRect (10, 10, 150, 100);
   }
 }
}
