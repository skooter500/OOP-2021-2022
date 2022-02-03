package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX, playerY, playerWidth;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);

		smooth();

		playerX = width / 2;
		playerY = height - 50;
		playerWidth = 50;
		
	}

	void drawPlayer(float x, float y, float w)
	{
		stroke(255);
		noFill();
		rectMode(CENTER);
		rect(x, y, w, 20);
		line(x, y - 10, x, y - 20);
	}

	
	public void draw()
	{	background(0);
		strokeWeight(2);
		drawPlayer(playerX, playerY, playerWidth);
	}
}
