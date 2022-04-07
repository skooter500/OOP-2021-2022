package ie.tudublin;

import processing.core.PApplet;

public class TimingExample extends PApplet {

    int mode = 0;

    Drawable d = new CircleDrawable(this);

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
            if (d instanceof RectDrawable)
            {
                d = new CircleDrawable(this);
            }
            //mode = 0;
        }
        else if (m > 2000)
        {
            d = new RectDrawable(this);
            //mode = 1;
        }
        background(0);
        d.render();

        /*
        
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
        */
    }    
}
