package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		
	}

	
	public void draw()
	{	
		// //multiple rectangles in a row
		// background(255);
		// fill(50);
		// stroke(255);
		// strokeWeight(2);
		// int pos = 50;
		// int wid = 50;
		// int quant = floor( width / wid );
		// colorMode(HSB,quant,100,100);
		// for( int i=0; i<quant; i++){
		// 	fill(i,100,100);
		// 	rect(i*pos,0,wid,height);
		// 	ellipse(i*pos + wid/2, 100, wid, wid);
		// }

		//Concentric circles
		colorMode(HSB, 5000, 100, 100);
		for (int x = 0; x<500; x+=50) {
			for (int y = 0; y <500; y+=50) {
			stroke(0);
			strokeWeight(1);
			fill((x*8)+y, 100, 100);
			circle(255, 255, 400-x);
   			 }
  		}


		// //Nested loop for circles
		// colorMode(HSB, 5000, 100, 100);

		// for (int x = 0; x<500; x+=50) {
		// 	for (int y = 0; y <500; y+=50) {
		// 	stroke(0);
		// 	strokeWeight(1);
		// 	fill((x*10)+y, 100, 100);
		// 	circle(x+25, y+25, 50);
   		// 	 }
  		// }
	}
}
