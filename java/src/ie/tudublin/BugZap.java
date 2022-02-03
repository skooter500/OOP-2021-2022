package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX, playerY, playerWidth;

	float bugX, bugY, bugWidth;

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
	
		resetBug();
		
	}

	private void resetBug() {
		bugX = random(bugWidth / 2, width - (bugWidth / 2));
		bugY = 50;
		bugWidth = 50;
	}

	void drawBug(float x, float y, float w)
	{
		float halfW = w / 2;
		stroke(255);
		noFill();
		triangle(x - halfW, y + halfW, x, y - halfW, x + halfW, y + halfW);
	}

	void drawPlayer(float x, float y, float w)
	{
		stroke(255);
		noFill();
		rectMode(CENTER);
		rect(x, y, w, 20);
		line(x, y - 10, x, y - 20);
	}

	float playerSpeed = 5;

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			playerX -=playerSpeed;
		}
		if (keyCode == RIGHT)
		{
			playerX +=playerSpeed;
		}
		
	}

	void moveBug()
	{
		bugY ++;
		bugX += random(-20, 20);
	}

	
	public void draw()
	{	background(0);
		strokeWeight(2);
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugWidth);
		if (frameCount % 20 == 0)
			moveBug();
	}
}
