
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class Aufg_15_02 extends JPanel
{
	public void paint (Graphics g)
	{
	    g.setColor(Color.BLUE);
	    g.drawOval(20,20,3,3);
	    g.setColor(Color.GREEN);
	    g.fillRect(40,40,10,10);
	    g.setColor(Color.MAGENTA);
	    g.drawLine(2,60,2,80);
		Font f = new Font("Lucida Sans Bold", Font.PLAIN, 22);
		g.setFont(f);
		g.setColor(Color.BLACK);
		g.drawString("Hallo Test",100,100);
	}

}
