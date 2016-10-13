// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	g.drawRect(50,50,300,300);
	g.drawRect(100, 100,300, 300);
	g.drawLine(50, 50, 100, 100);
	g.drawLine(50, 350, 100, 400);
	g.drawLine(350, 50, 400, 100);
	g.drawLine(350, 350, 400, 400);
		// DRAW SPHERE
	g.drawOval(75, 75, 300, 300);
	g.drawOval(112, 75, 225, 300);
	g.drawOval(150, 75, 150, 300);
	g.drawOval(187, 75, 75, 300);
	g.drawOval(75, 112, 300, 225);
	g.drawOval(75, 150, 300, 150);
	g.drawOval(75, 187, 300, 75);
		// DRAW TRIANGLE	
	g.drawLine(350, 500, 550, 350);
	g.drawLine(550, 350, 750, 500);
	g.drawLine(350, 500, 750, 500);
	g.drawLine(450, 425, 750, 500);
	g.drawLine(350, 500, 650, 425);
	g.drawLine(550, 350, 550, 500);
	
	}

}


