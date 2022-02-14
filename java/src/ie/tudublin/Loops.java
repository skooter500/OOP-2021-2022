package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	float magicMap(float a, float b, float c, float d, float e)
	{
		float output;
		a -= b;
		c -= b;
		e-= d;

		output = ((a/c)*e) + d;

		return output;
	}

	float magicMap1(float a, float b, float c, float d, float e)
	{
		float r1 = c -b;
		float r2 = e-d;
		float howFar = a - b;

		return d + ((howFar / r1) * r2);
	}

	
	public void draw()
	{
		
		switch(mode)	
		{
			case 0:
				background(0);
				int bars = (int) (mouseX / 20.0f);
				float w = width / (float)bars;	
				for(int i = 0 ; i < bars ; i ++)
				{
					noStroke();
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}
				break;
			case 1:
				background(0);
				int squares = (int) (mouseX / 20.0f); // Mouse position determines size of squares
				float h = width / (float) squares; // Number of squares going across
				for (int i=0; i<squares; i++) {
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 9, width); // Height
					rect(x, x, h, h);
					rect((width-h), -x, x);
				}

				break;
				//map(a,b,c,d,e);
				//a = inputvalue
				// b - c - start and end of the first range
				// d, e 0 - start and and of the end range

				// map(-2, 10, 90, 200, 233);


		}
	}
}
