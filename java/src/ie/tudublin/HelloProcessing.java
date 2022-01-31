package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB); Hue saturation Brightness
		colorMode(RGB);
		background(0);
	}

	public void draw()
	{	
		stroke(255); 
		background	(255, 0, 0); //greyscale
		//coordinates x1 y1 x2 y2
		//line(10, 10, 200, 200);
		// cx, xy ,r
		fill(255, 255, 0);
		circle(250, 250, 400);
		
		// cx, cy, w h
		//ellipse(50, 200, 90, 200);

		//stroke(0);


		//rectMode(CENTER);
		//rect(300, 20, 100, 20);
		// tlx, tly, w ,h
		//rectMode(CORNER);
		//rect(300, 20, 100, 20);

		// to plot a single pixle
		//point(20, 300); 

		// x1, y1, x2, y2, x3, y3
		fill(0, 255, 255);
		stroke(0);
		triangle(250, 20, 50, 400, 450, 400);
		
		fill(0, 0, 0);
		stroke(255);
		ellipse(250, 250, 210, 90);

		fill(255, 255, 255);
		stroke(0, 0, 0);
		ellipse(250, 250, 60, 90);

		stroke(0);
		fill(255, 0, 0);
		ellipse(250, 250, 30, 90);
		
		
	}
}
