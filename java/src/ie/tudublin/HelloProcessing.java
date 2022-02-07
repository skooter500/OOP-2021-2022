package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		// background(0);

		
	}
	public void draw()
	{	
	
	stroke(255); // used to set color of lines
	background(255, 0, 0); //greyscale
	// line (10, 10, 200, 200); //x1, y1, x2, y2
	fill(255,255,0);
	circle (250, 250, 400); //cx, cy, r
	noFill();

	// fill (137,207,240);
	// ellipse(225, 225, 90, 200); //cx, cy, width, height
	// stroke(255);	
	// noFill();
	// noStroke();
	// rectMode(CENTER);
	// rect(300, 100, 100, 20); //Topleftx, toplefty, width height

	// rectMode(CORNER);
	// rect(300, 100, 100, 60);

	point(255, 255); //x, y
	
	fill(48,213,200);
	triangle(15, 400, 490, 400, 250, 5); //x1, y1, x2, y2, x3, y3
	noFill();
	// noFill();
	fill(244, 194, 194);
	ellipse(255, 255, 200, 90);
	noFill();
	fill(0);
	circle(255, 255, 65);
	noFill();

	}
}
