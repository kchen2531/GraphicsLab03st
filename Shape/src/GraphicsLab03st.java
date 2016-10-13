// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random();
		
		
		// Draw Random Lines
		for (int l = 1; l <= 100; l++)
		{
			int x1 = rnd.nextInt(390)+10;
			int x2 = rnd.nextInt(390)+10;
			int y1 = rnd.nextInt(290)+10;
			int y2 = rnd.nextInt(290)+10;
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			g.setColor(new Color(red,green,blue));
			g.drawLine(x1,y1,x2,y2);
		}

		
				
		
		// Draw Random Squares
		for (int k = 1; k <= 100; k++)
		{
			int a1 = rnd.nextInt(340)+400;
			int b1 = rnd.nextInt(240)+10;
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			g.setColor(new Color(red,green,blue));
			g.fillRect(a1,b1,50, 50);
		}


		
		// Draw Random Circles
		for (int l = 1; l <= 100; l++)
		{
			int c2 = rnd.nextInt(200);
			int c1 = rnd.nextInt(390-c2)+10;
			int d1 = rnd.nextInt(290-c2)+300;
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			g.setColor(new Color(red,green,blue));
			g.drawOval(c1, d1, c2, c2);
		}

		Color myGreen = new Color(0,255,0);
		Color myRed = new Color(255,0,0);
		Color myBlue = new Color(0,0,255);
		Color myYellow = new Color(255,240,13);
		
		// Draw 3-D Box
		g.setColor(myGreen);
		Polygon z = new Polygon();
		z.addPoint(500,350);
		z.addPoint(500,450);
		z.addPoint(550,500);
		z.addPoint(550,400);
		g.fillPolygon(z);
		
		g.setColor(myRed);
		Polygon y = new Polygon();
		y.addPoint(550,500);
		y.addPoint(550,400);
		y.addPoint(650,400);
		y.addPoint(650,500);
		g.fillPolygon(y);
		
		g.setColor(myBlue);
		Polygon x = new Polygon();
		x.addPoint(650,400);
		x.addPoint(600,400);
		x.addPoint(600,350);
		g.fillPolygon(x);
		
		g.setColor(myYellow);
		Polygon t = new Polygon();
		t.addPoint(600,350);
		t.addPoint(600,400);
		t.addPoint(550,400);
		t.addPoint(500,350);
		g.fillPolygon(t);
	}
		
}



    
 