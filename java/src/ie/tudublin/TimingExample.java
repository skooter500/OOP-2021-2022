package ie.tudublin;

import processing.core.PApplet;

public class TimingExample extends PApplet {

    int mode = 0;

    public void setup()
    {

    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        int m = millis();
        println(m);
        if (m > 4000)
        {
            mode = 0;
        }
        else if (m > 2000)
        {
            mode = 1;
        }
        background(0);
        switch (mode) {
            case 0:
                circle(width / 2, height /2, 100);
                break;
            case 1:
                rectMode(CENTER);
                rect(width / 2, height / 2, 100, 100);
                break;
            default:
                break;
        } 
    }    
}
