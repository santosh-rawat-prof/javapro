import javax.swing.*;
import java.awt.*;

public class MenuDemo
{
       public MenuDemo()
    {
             Frame frame = new Frame("Menu and Menu Bars");

             MenuBar menuBar = new MenuBar();

             Menu fileMenu = new Menu("File");
             Menu editMenu = new Menu("Edit");
             Menu pasteMenu = new Menu("Paste");

             MenuItem item1 = new MenuItem("New");
             MenuItem item2 = new MenuItem("Open");
             MenuItem item3 = new MenuItem("Save");
             MenuItem item4 = new MenuItem("Save As");
             MenuItem item5 = new MenuItem("Exit");

             MenuItem item6 = new MenuItem("Cut");
             MenuItem item7 = new MenuItem("Copy");

             MenuItem item8 = new MenuItem("Plain Text Paste");
             MenuItem item9 = new MenuItem("Formatted Text Paste");

             pasteMenu.add(item8);
             pasteMenu.add(item9);
	     
             fileMenu.add(item1);
             fileMenu.add(item2);
             fileMenu.add(item3);
             fileMenu.add(item4);
             fileMenu.add(item5);

             editMenu.add(item6);
             editMenu.add(item7);
             editMenu.add(pasteMenu);

             menuBar.add(fileMenu);
             menuBar.add(editMenu);

             frame.setMenuBar(menuBar);

             frame.setSize(400,150);
             frame.setLayout(null);
             frame.setVisible(true);

             item2.addActionListener(e -> 
           {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
           });
     }
      public static void main(String args[])
    {
            new MenuDemo();
    }
}
