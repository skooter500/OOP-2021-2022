package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {
	
	LifeBoard board;


	public void settings() {
		size(500, 500);
		board = new LifeBoard(20, this);
		board.randomise();
		println(board.countCellsAround(1, 1));

	}

	public void setup() {
		colorMode(RGB);

	}

	
	public void draw() {
		board.render();
	}
}
