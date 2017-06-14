
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Aufg_15_02b extends JPanel
{
   private Image imgArray[];
   

   public Aufg_15_02b()
   {
      // alle 10 Bilder laden
	  imgArray = new Image[10];
      for(int i=0; i<10; i++){
    	  
    	  try {
			imgArray[i] = ImageIO.read(new File("D:\\DEV\\FOM\\FOM_Objektorientiertes_Programmieren\\OOP_15\\digits\\digit_"+i+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
      }       
      
   }

   public void paint(Graphics g){
	   // Uhrzeit bestimmen
	   GregorianCalendar now = new GregorianCalendar();                  
	   SimpleDateFormat formatter = new SimpleDateFormat ("HHmm");      
	   String currentTime = formatter.format(now.getTime());
	   int index, i=0;

	   do{
		   i++;
		   repaint();
		   // Uhrzeit mit Bildern anzeigen
		   g.fillRect(0, 0, getWidth(), getHeight());
		   Image i1, i2, i3, i4;
		   index = Integer.valueOf(currentTime.substring(0, 1));
		   i1 = imgArray[index];
		   g.drawImage(i1, 10, 10, 36, 46, this);

		   index = Integer.valueOf(currentTime.substring(1, 2));
		   i2 = imgArray[index];
		   g.drawImage(i2, 50, 10, 36, 46, this);

		   index = Integer.valueOf(currentTime.substring(2, 3));
		   i3 = imgArray[index];
		   g.drawImage(i3, 90, 10, 36, 46, this);

		   index = Integer.valueOf(currentTime.substring(3, 4));
		   i4 = imgArray[index];
		   g.drawImage(i4, 130, 10, 36, 46, this);
	   }
		while(i != 9999999);
   }
}
