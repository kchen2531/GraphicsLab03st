// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);	
		

		for ( x1 = 10; x1 < 990; x1 += 14){
			
			g.drawLine(x1,y1,x2,y2);;
			y2 -= 9;
	}
		for ( x2 = 990; x2 > 10; x2 -= 14){
				
				g.drawLine(x1,y1,x2,y2);;
				y1 -= 9;
	}
	
		for ( y2 = 10; y2 < 640; y2 += 9){
			
			g.drawLine(x1,y1,x2,y2);;
			x1 -= 14;
	}

		for ( y1 = 10; y1 < 640; y1 += 9){
			
			g.drawLine(x1,y1,x2,y2);;
			x2 += 14;
		
	}
		g.drawRect(260, 170, 462, 297);
		
		int x3 = 250;
		int y3 = 480;
		int x4 = 750;
		int y4 = 480;
		
		for ( x3 = 260; x3 < 722; x3 += 14) {
			g.drawLine(x3,y3,x4,y4);;
			y4 -= 9;
			
	}

		for ( y3 = 467; y3 > 170; y3 -= 9) {
			g.drawLine(x3,y3,x4,y4);;
			x4 -= 14;
			
	}

}
}
