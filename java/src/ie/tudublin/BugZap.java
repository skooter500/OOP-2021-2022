package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
    public void settings() {
        size(500, 500);
    }

    public void setup() {
        colorMode(RGB);
        background(0);
    }

    public void drawPlayer(float x, float y, float w) {
        stroke(255);
        line(x, y, x + 5, w * 5);
    }

    public void draw() {
        background(0);
        fill(255);
        float playerX = 10;
        float playerY = 2;
        float playerWidth = 5;
        drawPlayer(playerX, playerY, playerWidth);
    }

    public void keyPressed() {
        if (keyCode == LEFT) {
            playerX = playerX - 1;
        }
        if (keyCode == RIGHT) {
            System.out.println("Right arrow pressed");
        }
        if (key == ' ') {
            System.out.println("SPACE key pressed");
        }
    }

}