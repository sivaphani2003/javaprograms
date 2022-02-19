import java.awt.*;
import java.applet.*;
import java.net.*;
import java.awt.event.*;
import java.awt.Desktop.*;
public class Goto_Link extends Applet implements ActionListener
{
    //Function to initialize the applet
    public void init()
    {
	setBackground(Color.white);
	Button button1 = new Button("google");
	Button button2 = new Button("yahoo");
	this.add(button1);
	this.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
    }
    //Function to go to the link
    public void actionPerformed(ActionEvent e)
    {
	String button = e.getActionCommand();
	String link = "http://www."+button+".com";
	try
	{
	    Desktop.getDesktop().browse(new URI(link));
	}
	catch (Exception E)
	{
	}
    }
}
/*
<applet code=Goto_Link.class width=500 height=500>
</applet>
*/
