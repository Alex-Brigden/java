package college_HW;

import java.applet.*;
import java.awt.*;


public class RectMessApplet extends Applet {
    String message = "Hello friend!";
    Color fillColor = Color.green;
    Color textColor = new Color ( 0, 100, 0 ) ; 

    public void paint( Graphics g )
    {   
       g.setColor( fillColor );
       g.fillRect ( 150, 15, 100, 100 );
       g.setColor( textColor );
       g.drawRect( 150, 15, 100, 100 );
       g.setColor(Color.orange);
       g.drawString( message, 170, 50 );
      
   }


}
