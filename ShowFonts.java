package college_HW;

import java.applet.Applet;
import java.awt.*;

public class ShowFonts extends Applet{
	   Font font1, font2;

	   public void init(){
	      // create a font object: 30-point bold Comic Sans MS
	      font1 = new Font ("Comic Sans MS", Font.BOLD, 30);

	      // create a font object: 24-point bold and italic Bank Gothic
	      font2 = new Font ("Bank Gothic", Font.BOLD + Font.ITALIC, 24);
	   }
	   public void paint( Graphics g ){
	      // set the current font to font1
	      g.setFont( font1 );
	      g.setColor(Color.magenta);
	      g.drawString("This text is Comic Sans MS 30 point bold.", 20, 25 ); 

	      // set the current font to font2
	      g.setFont( font2 );
	      g.setColor(Color.GRAY);
	      g.drawString("This text is Bank Gothic 24 point bold and italic.",
		   20, 60 );
	   }



}
