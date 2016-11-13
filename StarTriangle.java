package college_HW;

import java.applet.*;
import java.awt.*;
// This applet draws a colourful triangle of stars.
public class StarTriangle extends Applet{

	public void paint(Graphics g){
		g.setColor( Color.red );
		g.drawString("*", 70, 70);
		g.setColor( Color.orange );
		g.drawString("**", 68, 80);
		g.setColor( Color.yellow );
		g.drawString("***", 66, 90);
		g.setColor( Color.green );
		g.drawString("****", 64, 100);
		g.setColor( new Color (173,216,230));
		g.drawString("*****", 62, 110);
		g.setColor( new Color (0,0,139));		
		g.drawString("******", 60, 120);
		g.setColor( new Color (238,130,238));
		g.drawString("*******", 58, 130);
		
		

	}

}
