package college_HW;

import java.applet.*;
import java.awt.*;

public class Oval extends Applet {
	public void paint(Graphics g) {
	    g.fillOval (10, 10, 400, 200);
	    g.fillOval (440, 10, 400, 200);
	    g.setColor( new Color (238,130,238));
	    g.fillOval(190, 45, 50, 110);
	    g.setColor( new Color (176,224,230));
	    g.fillOval(650, 50, 50, 110);
	  }
	
}
