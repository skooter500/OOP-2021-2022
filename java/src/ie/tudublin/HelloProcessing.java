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
		//background(0);

	}

	public void draw()
	{	
		background(255, 255, 0); // Greyscale
		line(10, 10, 200, 200); // x1, y1, x2, y2
		circle(200, 250, 50);// cx, cy, r
		ellipse(50, 200, 90, 200);  // cx, cy, w, h

		stroke(0);
		fill(0, 0, 255);
		noFill();
		noStroke();
		rectMode(CENTER);		
		rect(300, 20, 100, 20); // tlx, tly, w, h
		
		rectMode(CORNER);
		rect(200, 20, 100, 20); // tlx, tly, w, h

		point(20, 300);

		triangle(10, 400, 50, 450, 300, 200); // x1, y1, x2, y2, x3, y3
		
	}
}
